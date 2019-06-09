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
    public partial class FormGestionarHijos : Form
    {
        public FormGestionarHijos()
        {
            InitializeComponent();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnAgregarHijo_Click(object sender, EventArgs e)
        {
            FormInscribirUsuario formInscribirUsuario = new FormInscribirUsuario(3);
            formInscribirUsuario.Show();
        }
    }
}
