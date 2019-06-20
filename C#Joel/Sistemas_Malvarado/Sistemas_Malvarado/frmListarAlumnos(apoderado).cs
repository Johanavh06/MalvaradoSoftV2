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
    public partial class frmListarAlumnos : Form
    {
        frmListarCursos_apoderado_ listarCursos;

        public frmListarAlumnos()
        {
            InitializeComponent();
        }

        private void listarCursos_alumno(object sender, DataGridViewCellEventArgs e)
        {
            listarCursos = new frmListarCursos_apoderado_();
            listarCursos.ShowDialog();
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
