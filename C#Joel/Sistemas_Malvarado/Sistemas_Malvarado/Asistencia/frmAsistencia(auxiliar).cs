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

    public partial class frmAsistencia : Form
    {
        private frmGestionarAsistencia frm;
        private BindingList<Alumno> alumnos;
        public frmAsistencia()
        {
            InitializeComponent();
        
            dgvAlumnos.AutoGenerateColumns = false;
            //txtGrado.Text = frm.g.ToString();
            //txtSeccion.Text = frm.s;
            
            alumnos = new BindingList<Alumno>();
            Alumno a1 = new Alumno("Renato Cruzado Arroyo", false, "");
            Alumno a2 = new Alumno("Johana Vergara Hernández", false, "");
            Alumno a3 = new Alumno("Sebastian Sanchez Herrera", false, "");
            Alumno a4 = new Alumno("Andres Merino de las Casas", false, "");
            Alumno a5 = new Alumno("Carlos Ramirez Carranza", false, "");
            Alumno a6 = new Alumno("Bruno Espezúa Zapana", false, "");
            alumnos.Add(a1);
            alumnos.Add(a2);
            alumnos.Add(a3);
            alumnos.Add(a4);
            alumnos.Add(a5);
            alumnos.Add(a6);

            dgvAlumnos.DataSource = alumnos;
        }
        public frmAsistencia(int gra, string sec)
        {
            InitializeComponent();

            dgvAlumnos.AutoGenerateColumns = false;
            txtGrado.Text = gra.ToString();
            txtSeccion.Text = sec;
            txtSeccion.Enabled = false;
            txtGrado.Enabled = false;
            alumnos = new BindingList<Alumno>();
            Alumno a1 = new Alumno("Renato Cruzado Arroyo", false, "");
            Alumno a2 = new Alumno("Johana Vergara Hernández", false, "");
            Alumno a3 = new Alumno("Sebastian Sanchez Herrera", false, "");
            Alumno a4 = new Alumno("Andres Merino de las Casas", false, "");
            Alumno a5 = new Alumno("Carlos Ramirez Carranza", false, "");
            Alumno a6 = new Alumno("Bruno Espezúa Zapana", false, "");
            alumnos.Add(a1);
            alumnos.Add(a2);
            alumnos.Add(a3);
            alumnos.Add(a4);
            alumnos.Add(a5);
            alumnos.Add(a6);

            dgvAlumnos.DataSource = alumnos;
        }

        private void Button1_Click_1(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("¿Está seguro de que desea registrar la asistencia?", "Advertencia", MessageBoxButtons.YesNoCancel);
            if (result == System.Windows.Forms.DialogResult.Yes)
                this.DialogResult = DialogResult.OK;
        }

        private void Button2_Click_1(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }
    }
    public class Alumno{
        private string name;
        private bool est;
        private string com;

        public Alumno(string name, bool est, string com)
        {
            this.Name = name;
            this.Est = est;
            this.Com = com;
        }

        public string Name { get => name; set => name = value; }
        public string Com { get => com; set => com = value; }
        public bool Est { get => est; set => est = value; }
    }
}
