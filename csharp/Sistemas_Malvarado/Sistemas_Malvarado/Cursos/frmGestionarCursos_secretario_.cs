using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistemas_Malvarado.Cursos
{
    public partial class FormGestionarCursos : Form
    {
        public FormGestionarCursos()
        {
            InitializeComponent();
        }

        private void BtnBuscarUsuario_Click(object sender, EventArgs e)
        {
            frmBuscarCurso_secretario_ frmbuscar = new frmBuscarCurso_secretario_();
            if (frmbuscar.ShowDialog() == DialogResult.OK)
            {

            }
        }
    }
}
