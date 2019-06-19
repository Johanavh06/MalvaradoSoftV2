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
    public partial class frmBuscarCurso_secretario_ : Form
    {
        public frmBuscarCurso_secretario_()
        {
            InitializeComponent();
        }

        private void FrmBuscarCurso_secretario__FormClosing(object sender, FormClosingEventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }

        private void DataGridView1_DoubleClick(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }
    }
}
