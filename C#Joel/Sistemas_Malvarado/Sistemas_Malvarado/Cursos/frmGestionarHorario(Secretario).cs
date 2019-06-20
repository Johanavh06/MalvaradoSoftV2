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
    public partial class frmGestionarHorario_Secretario_ : Form
    {
        public frmGestionarHorario_Secretario_()
        {
            InitializeComponent();
        }

        private void ButtonAgregar_Click(object sender, EventArgs e)
        {
            frmGestionarCursoPorSeccion frm = new frmGestionarCursoPorSeccion();
            if (frm.ShowDialog() == DialogResult.OK)
            {

            }
        }
    }
}
