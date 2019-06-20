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
    public partial class frmListarCursos_apoderado_ : Form
    {
        frmListarNotas_apoderado_ listarNotas;

        public frmListarCursos_apoderado_()
        {
            InitializeComponent();
        }

        private void listarNotas_alumno(object sender, DataGridViewCellEventArgs e)
        {
            listarNotas = new frmListarNotas_apoderado_();
            listarNotas.Enabled = true;
            listarNotas.ShowDialog();
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
