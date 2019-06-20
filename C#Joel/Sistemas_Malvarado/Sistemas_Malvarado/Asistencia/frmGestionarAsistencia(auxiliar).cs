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
    public partial class frmGestionarAsistencia : Form
    {
        private BindingList<int> grado;
        private BindingList<string> sec;
        private int g;
        private string s;

        public string S { get => s; set => s = value; }
        public int G { get => g; set => g = value; }

        public frmGestionarAsistencia()
        {
            InitializeComponent();
            grado = new BindingList<int>();
            grado.Add(1);
            grado.Add(2);
            grado.Add(3);
            grado.Add(4);
            grado.Add(5);
            grado.Add(6);
            sec = new BindingList<string>();
            sec.Add("A");
            sec.Add("B");
            cbGrado.DataSource = grado;
            cbSeccion.DataSource = sec;
        }



        private void FrmGestionarAsistencia_Load(object sender, EventArgs e)
        {

        }

        private void Button1_Click(object sender, EventArgs e)
        {
            S = cbSeccion.Text;
            G = Int32.Parse(cbGrado.Text);
            frmAsistencia frmAsistencia = new frmAsistencia(g, s);
            if (frmAsistencia.ShowDialog() == DialogResult.OK)
            {

            }
        }

        private void Button2_Click(object sender, EventArgs e)
        {
           
            this.DialogResult = DialogResult.OK;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
