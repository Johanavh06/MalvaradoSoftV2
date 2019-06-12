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
    public partial class frmListarNotas_apoderado_ : Form
    {
        //frmVerFeedbak_apoderado_ frmFeed;

        public frmListarNotas_apoderado_()
        {
            InitializeComponent();
        }

        private void verFeedback(object sender, DataGridViewCellEventArgs e)
        {
            //frmFeed = new frmVerFeedbak_apoderado_();
            //frmFeed.ShowDialog();
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void frmListarNotas_apoderado__Load(object sender, EventArgs e)
        {

        }
    }
}
