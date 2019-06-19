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
    public partial class frmMatricularAlumnos_secretario_ : Form
    {
        public frmMatricularAlumnos_secretario_()
        {
            InitializeComponent();
        }

        private void btnSeleccionarTodo_Click(object sender, EventArgs e)
        {
            int nf = dgvMatricula.RowCount;
            for (int i = 0; i < nf; i++)
            {
                
            }
        }
    }
}
