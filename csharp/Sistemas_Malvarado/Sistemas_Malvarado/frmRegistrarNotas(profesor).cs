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
    public partial class frmRegistrarNotas : Form
    {

        private frmFeedback feed;

        public frmRegistrarNotas()
        {
            InitializeComponent();
        }

        private void ingresarFeedback(object sender, DataGridViewCellEventArgs e)
        {
            feed = new frmFeedback();
            feed.ShowDialog();
        }
    }
}
