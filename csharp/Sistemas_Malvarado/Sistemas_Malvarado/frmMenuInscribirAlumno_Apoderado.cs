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
    public partial class frmMenuInscribirAlumno_Apoderado : Form
    {
        public frmMenuInscribirAlumno_Apoderado()
        {
            InitializeComponent();
        }

        private void btnAdd1_Click(object sender, EventArgs e)
        {
            btnAdd1.Visible = false;
            crearUnAlumno();
        }

        public void crearUnAlumno()
        {
            Button btn = new Button();
            btn.Text = " ";

        }

    }
}
