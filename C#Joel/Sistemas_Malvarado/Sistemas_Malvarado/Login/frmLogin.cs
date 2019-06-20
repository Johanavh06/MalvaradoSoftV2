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
        private int intentos;
        private int contador = 100;
        MAlvaradoWS.DBControllerWSClient controller;
        MAlvaradoWS.user user;

        public frmLogin()
        {
            InitializeComponent();
            controller = new MAlvaradoWS.DBControllerWSClient();
            user = new MAlvaradoWS.user();
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


        /* ************** CONTRASEÑA = "123" ************** 
                  * Usuario 1: admin
                  * Usuario 2: secretario
                  * Usuario 3: profesor
                  * Usuario 4: auxiliar
                  * Usuario 5: apoderado
                  * Usuario 6: alumno
                  * Usuario 7: profesor_apoderado
                  * Usuario 8: auxiliar_apoderado
                  * Usuario 9: secretario_apoderado
        */

        private void btnAcceder_Click(object sender, EventArgs e)
        {
            if (String.Equals(txtUser.Text, "USUARIO") || String.Equals(txtPassword.Text, "CONTRASEÑA"))
            {
                msgError("Ingrese un usuario y/o contraseña valida.");
                return;
            }

            user = controller.queryUserLogin(txtUser.Text, txtPassword.Text);
            intentos = user.nAttempts;

            if (user != null)
            {
                if (intentos > 5)
                {
                    MessageBox.Show("Ha excedido el numero de intentos posibles. Su cuenta ha sido bloqueada", "IMPORTANTE!");
                    contador = 100;
                    btnAcceder.Enabled = false;
                    timer1.Enabled = true;
                }


                //SI ES UN USUARIO EXISTENTE
                if (String.Equals(txtPassword.Text, user.password))
                {
                    MAlvaradoWS.userType [] types = controller.queryAllTypesXIDUser(user.idUser);

                    if (types.Length> 1)
                    {
                        frmIniciarTipoUsuario frmTipo = new frmIniciarTipoUsuario();
                        types.CopyTo(frmTipo.Permisos,0);
                        frmTipo.FormClosed += Logout;
                        frmTipo.Show();
                    }
                    else
                    {
                        if (types[0].idUserType == 1)
                        {
                            frmMenuPrincipalSecretario menu = new frmMenuPrincipalSecretario();
                            menu.FormClosed += Logout;
                            menu.Show();
                        }
                        else if (types[0].idUserType == 2)
                        {
                            frmMenuPrincipalApoderado menu = new frmMenuPrincipalApoderado();
                            menu.FormClosed += Logout;
                            menu.Show();
                        }
                        else if (types[0].idUserType == 3)
                        {
                            frmMenuPrincipalProfesor menu = new frmMenuPrincipalProfesor();
                            menu.FormClosed += Logout;
                            menu.Show();
                        }
                        else if (types[0].idUserType == 4)
                        {
                            frmMenuPrincipalAlumno menu = new frmMenuPrincipalAlumno();
                            menu.FormClosed += Logout;
                            menu.Show();
                        }
                        else if (types[0].idUserType == 5)
                        {
                            frmMenuPrincipalAuxiliar menu = new frmMenuPrincipalAuxiliar();
                            menu.FormClosed += Logout;
                            menu.Show();
                        }
                    }
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
