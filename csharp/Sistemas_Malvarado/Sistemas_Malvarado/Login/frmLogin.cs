using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using Sistemas_Malvarado.MenuPrincipal;
using Sistemas_Malvarado.Login;

namespace Sistemas_Malvarado
{
    public partial class frmLogin : Form
    {
        frmRecuperarContraseña recuperarContraseña;
        private int intentos = 0;
        private int contador = 100;
        private MAlvaradoWS.DBControllerWSClient controller;
        private MAlvaradoWS.user user;

        public frmLogin()
        {
            controller = new MAlvaradoWS.DBControllerWSClient();
            user = new MAlvaradoWS.user();
            InitializeComponent();
        }

        //Para movilizar el form
        [DllImport("user32.DLL", EntryPoint = "ReleaseCapture")]
        private extern static void ReleaseCapture();
        [DllImport("user32.DLL", EntryPoint = "SendMessage")]
        private extern static void SendMessage(System.IntPtr hwnd, int wmsg, int wparam, int lparam);


        private void txtUser_Enter(object sender, EventArgs e)
        {
            if (txtUser.Text == "USUARIO")
            {
                txtUser.Text = "";
                txtUser.ForeColor = Color.DimGray;
            }
        }

        private void txtUser_Leave(object sender, EventArgs e)
        {
            if (txtUser.Text == "")
            {
                txtUser.Text = "USUARIO";
                txtUser.ForeColor = Color.DimGray;
            }
        }

        private void txtPassword_Enter(object sender, EventArgs e)
        {
            if (txtPassword.Text == "CONTRASEÑA")
            {
                txtPassword.Text = "";
                txtPassword.ForeColor = Color.DimGray;
                txtPassword.UseSystemPasswordChar = true;
            }
        }

        private void txtPassword_Leave(object sender, EventArgs e)
        {
            if (txtPassword.Text == "")
            {
                txtPassword.Text = "CONTRASEÑA";
                txtPassword.ForeColor = Color.DimGray;
                txtPassword.UseSystemPasswordChar = false;
            }
        }

        private void btnCerrar_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnMinimizar_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        private void Login_MouseDown(object sender, MouseEventArgs e) //Para movilizar el form en la pantalla
        {
            ReleaseCapture();
            SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        private void panel1_MouseDown(object sender, MouseEventArgs e)
        {
            ReleaseCapture();
            SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        private void btnOcultarContraseña_Click(object sender, EventArgs e)
        {
            txtPassword.UseSystemPasswordChar = false;
            btnMostrarContraseña.Visible = true;
            btnOcultarContraseña.Visible = false;
        }

        private void btnMostrarContraseña_Click(object sender, EventArgs e)
        {
            btnMostrarContraseña.Visible = false;
            btnOcultarContraseña.Visible = true;
            txtPassword.UseSystemPasswordChar = true;
        }


        
        private void btnAcceder_Click(object sender, EventArgs e)
        {

            if (txtUser.Text == "USUARIO" || txtPassword.Text == "CONTRASEÑA") {
                msgError("Ingrese un usuario y/o contraseña valida.");
                return;
            }

            intentos = controller.getNAttemptsByUserName(txtUser.Text);
            if (intentos > 6)
            {
                MessageBox.Show("Ha excedido el numero de intentos posibles. Su cuenta ha sido bloqueada", "IMPORTANTE!");
                contador = 100;
                btnAcceder.Enabled = false;
                
                timer1.Enabled = true;
            }

            int []tipo = new int[6] { 0, 0, 0, 0, 0 ,0 };
            
            //VALIDACION DE ROLES
            /*user = txtUser.Text;
            password = txtPassword.Text;
            if (user == "admin" && password == "123") { tipo[0] = 1; Validacion = true; }
            else if (user == "secretario" && password == "123") { tipo[1] = 1; Validacion = true; }
            else if (user == "profesor" && password == "123") { tipo[2] = 1; Validacion = true; }
            else if (user == "auxiliar" && password == "123") { tipo[3] = 1; Validacion = true; }
            else if (user == "apoderado" && password == "123") { tipo[4] = 1; Validacion = true; }
            else if (user == "alumno" && password == "123") { tipo[5] = 1; Validacion = true; }
            else if (user == "profesor_apoderado" && password == "123") { tipo[2] = 1; tipo[4] = 1; Validacion = true; }
            else if (user == "auxiliar_apoderado" && password == "123") { tipo[3] = 1; tipo[4] = 1; Validacion = true; }
            else if (user == "secretario_apoderado" && password == "123") { tipo[1] = 1; tipo[4] = 1; Validacion = true; }
            else
            {
                this.Intentos++;
                msgError("Ingrese un usuario y/o contraseña valida.");
            }

            if (Validacion == true)
            {
                int contador = 0;
                for (int i = 0; i < tipo.Length; i++)
                    if (tipo[i] == 1) contador++;
                if (contador > 1)
                {
                    frmIniciarTipoUsuario frmTipo = new frmIniciarTipoUsuario();
                    frmTipo.Permisos = tipo;
                    frmTipo.FormClosed += Logout;
                    frmTipo.Show();                    
                }
                else
                {
                    if (tipo[0] == 1)
                    {
                        frmMenuPrincipalAdministrador menu = new frmMenuPrincipalAdministrador();
                        menu.FormClosed += Logout;
                        menu.Show();
                    }
                    else if (tipo[1] == 1)
                    {
                        frmMenuPrincipalSecretario menu = new frmMenuPrincipalSecretario();
                        menu.FormClosed += Logout;
                        menu.Show();
                    }
                    else if (tipo[2] == 1)
                    {
                        frmMenuPrincipalProfesor menu = new frmMenuPrincipalProfesor();
                        menu.FormClosed += Logout;
                        menu.Show();
                    }
                    else if (tipo[3] == 1)
                    {
                        frmMenuPrincipalAuxiliar menu = new frmMenuPrincipalAuxiliar();
                        menu.FormClosed += Logout;
                        menu.Show();
                    }
                    else if (tipo[4] == 1)
                    {
                        frmMenuPrincipalApoderado menu = new frmMenuPrincipalApoderado();
                        menu.FormClosed += Logout;
                        menu.Show();
                    }
                    else if (tipo[5] == 1)
                    {
                        frmMenuPrincipalAlumno menu = new frmMenuPrincipalAlumno();
                        menu.FormClosed += Logout;
                        menu.Show();
                    }*/
                }
                this.Hide();
            }

        }

        private void Logout(object sender, FormClosedEventArgs e)
        {
            txtPassword.Clear();
            txtUser.Clear();
            this.Show();
            txtUser.Focus();            
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            lblMinutos.Visible = true;
            lblSegundos.Visible = true;
            label2.Visible = true;
            label6.Visible = true;
            label4.Visible = true;

            if (Contador > 0)
            {
                Contador--;
                int min = Contador / 60;
                int seg = Contador - min * 60;
                lblSegundos.Text = seg.ToString();
                lblMinutos.Text = min.ToString();
            }
            else
            {
                btnAcceder.Enabled = true;
            }

        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            recuperarContraseña = new frmRecuperarContraseña();
            recuperarContraseña.Show();
        }

        private void frmLogin_Load(object sender, EventArgs e)
        {

        }

        private void msgError (string msgError)
        {
            lblErrorMessage.Text = "       " + msgError;
            lblErrorMessage.Visible = true;
        }
        
    }
}
