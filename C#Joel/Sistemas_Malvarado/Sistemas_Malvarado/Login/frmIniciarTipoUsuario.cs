using Sistemas_Malvarado.MenuPrincipal;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistemas_Malvarado
{
    public partial class frmIniciarTipoUsuario : Form
    {
        MAlvaradoWS.userType[] permisos;
        public MAlvaradoWS.userType[] Permisos { get => permisos; set => permisos = value; }

        public frmIniciarTipoUsuario()
        {
            InitializeComponent();
        }

        private void frmIniciarTipoUsuario_Load(object sender, EventArgs e)
        {
            List<String> perm = new List<string>();
            for (int i = 0; i < permisos.Length; i++)
            {
                if (permisos[i].idUserType == 1) perm.Add("Secretario");
                if (permisos[i].idUserType == 2) perm.Add("Apoderado");
                if (permisos[i].idUserType == 3) perm.Add("Profesor");
                if (permisos[i].idUserType == 4) perm.Add("Alumno");
                if (permisos[i].idUserType == 5) perm.Add("Auxiliar");
            }
            cbPermisos.DataSource = perm;
        }

        private void btnAcceder_Click(object sender, EventArgs e)
        {
            string selected = cbPermisos.GetItemText(cbPermisos.SelectedItem);
            if (selected == "Secretario") { frmMenuPrincipalSecretario menu = new frmMenuPrincipalSecretario(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Apoderado") { frmMenuPrincipalApoderado menu = new frmMenuPrincipalApoderado(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Profesor") { frmMenuPrincipalProfesor menu = new frmMenuPrincipalProfesor(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Alumno") { frmMenuPrincipalAlumno menu = new frmMenuPrincipalAlumno(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Auxiliar") { frmMenuPrincipalAuxiliar menu = new frmMenuPrincipalAuxiliar(); menu.FormClosed += Logout; menu.Show(); }
            this.Hide();
        }
        private void Logout(object sender, FormClosedEventArgs e)
        {
            this.Show();
        }
        private void btnCerrarSesion_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
