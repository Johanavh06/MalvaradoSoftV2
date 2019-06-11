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
        private int[] permisos;
        public int[] Permisos { get => permisos; set => permisos = value; }

        public frmIniciarTipoUsuario()
        {
            InitializeComponent();
        }

        private void frmIniciarTipoUsuario_Load(object sender, EventArgs e)
        {
            List<string> perm = new List<string>();
            for (int i = 0; i < permisos.Length; i++)
            {
                if (permisos[i] == 1)
                {
                    if (i == 0) perm.Add("Administrador");
                    else if (i == 1) perm.Add("Secretario");
                    else if (i == 2) perm.Add("Profesor");
                    else if (i == 3) perm.Add("Auxiliar");
                    else if (i == 4) perm.Add("Apoderado");
                    else if (i == 5) perm.Add("Alumno");
                }
            }
            cbPermisos.DataSource = perm;
        }

        private void btnAcceder_Click(object sender, EventArgs e)
        {
            string selected = cbPermisos.GetItemText(cbPermisos.SelectedItem);
            if (selected == "Administrador") { frmMenuPrincipalAdministrador menu = new frmMenuPrincipalAdministrador(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Secretario") { frmMenuPrincipalSecretario menu = new frmMenuPrincipalSecretario(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Profesor") { frmMenuPrincipalProfesor menu = new frmMenuPrincipalProfesor(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Auxiliar") { frmMenuPrincipalAuxiliar menu = new frmMenuPrincipalAuxiliar(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Apoderado") { frmMenuPrincipalApoderado menu = new frmMenuPrincipalApoderado(); menu.FormClosed += Logout; menu.Show(); }
            else if (selected == "Alumno") { frmMenuPrincipalAlumno menu = new frmMenuPrincipalAlumno(); menu.FormClosed += Logout; menu.Show(); }
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
