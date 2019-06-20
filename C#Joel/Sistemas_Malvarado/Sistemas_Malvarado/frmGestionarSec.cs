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
    public partial class frmGestionarSec : Form
    {
        public frmGestionarSec()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            frmGestionarSeccion_secretario_ frmgs = new frmGestionarSeccion_secretario_();

        }
    }
}
