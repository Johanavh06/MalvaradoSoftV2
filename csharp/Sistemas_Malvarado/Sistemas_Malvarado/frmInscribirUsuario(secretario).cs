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
    public partial class frmInscribirUsuario_secretario_ : Form
    {
        public frmInscribirUsuario_secretario_()
        {
            InitializeComponent();
            this.tabAlumno.Parent = null;
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Se ha realizado con exito el registro", "Mensaje de Confirmacion", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void btnBuscarUsuario_Click(object sender, EventArgs e)
        {
            frmBuscarUsuario fbuscar = new frmBuscarUsuario();
            if (fbuscar.ShowDialog() == DialogResult.OK)
            {
                //Editar los parametros de los textBox según el usuario elegido

            }
        }

        private void ckApoderado_CheckedChanged(object sender, EventArgs e)
        {
            if (ckApoderado.Checked == true)
            {
                ckAlumno.Enabled = false;
            }
        }

        private void ckAlumno_CheckedChanged(object sender, EventArgs e)
        {
            if (ckAlumno.Checked == true)
            {
                this.tabAlumno.Parent = this.tabUsers;
                ckApoderado.Enabled = false;
                ckAuxiliar.Enabled = false;
                ckProfesor.Enabled = false;
                ckSecretaria.Enabled = false;

            }
            else
            {
                ckApoderado.Enabled = true;
                ckAuxiliar.Enabled = true;
                ckProfesor.Enabled = true;
                ckSecretaria.Enabled = true;
                this.tabAlumno.Parent = null;
            }
        }

        private void ckAuxiliar_CheckedChanged(object sender, EventArgs e)
        {
            if (ckAuxiliar.Checked == true)
            {
                ckAlumno.Enabled = false;
            }
        }

        private void ckSecretaria_CheckedChanged(object sender, EventArgs e)
        {
            if(ckSecretaria.Checked == true)
            {
                ckAlumno.Enabled = false;
            }
        }

        private void ckProfesor_CheckedChanged(object sender, EventArgs e)
        {
            if (ckProfesor.Checked == true)
            {
                ckAlumno.Enabled = false;
            }
        }
    }


}
