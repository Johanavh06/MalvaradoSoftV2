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

namespace Sistemas_Malvarado
{
    public partial class frmLogin : Form
    {
        String user, password;
        public int usuarioPermiso;
        public frmLogin()
        {
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
            btnMostrarContraseña.Visible = true;
            btnOcultarContraseña.Visible = false;
            txtPassword.UseSystemPasswordChar = false;
        }

        private void btnMostrarContraseña_Click(object sender, EventArgs e)
        {
            btnMostrarContraseña.Visible = false;
            btnOcultarContraseña.Visible = true;
            txtPassword.UseSystemPasswordChar = true;
        }

        private void btnAcceder_Click(object sender, EventArgs e)
        {
            user = txtUser.Text;
            password = txtPassword.Text;
            if (user == "secretario" || password == "secretario") usuarioPermiso = 1;
            else if (user == "auxiliar" || password == "auxiliar") usuarioPermiso = 2;
            else if (user == "apoderado" || password == "apoderado") usuarioPermiso = 3;
            else
            {
                MessageBox.Show("Usuario incorrecto");
                return;
            }
            frmMenuPrincipal menu = new frmMenuPrincipal();
            menu.permiso = usuarioPermiso;
            if (usuarioPermiso == 1) menu.DarPermiso(Permiso.Secretario);
            else if (usuarioPermiso == 2) menu.DarPermiso(Permiso.Auxiliar);
            else if (usuarioPermiso == 3) menu.DarPermiso(Permiso.Padre);
            menu.FormClosed += Logout;
            menu.Show();
            this.Hide();
        }
        private void Logout(object sender, FormClosedEventArgs e)
        {
            txtPassword.Clear();
            txtUser.Clear();
            this.Show();
            txtUser.Focus();
        }
    }
}
