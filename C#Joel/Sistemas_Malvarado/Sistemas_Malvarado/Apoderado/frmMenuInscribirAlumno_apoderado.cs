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
    public partial class frmMenuInscribirAlumno_apoderado : Form
    {
        public frmMenuInscribirAlumno_apoderado()
        {
            InitializeComponent();
            Alumno al = new Alumno("Renato Jimenez Sanchez", 4, 'M' );
            Alumno al2 = new Alumno("Alonso Cervantes Nuñez", 1, 'I');
            BindingList<Alumno> list = new BindingList<Alumno>();
            list.Add(al);
            list.Add(al2);
            dgvAlumnos.DataSource = list;
            btnEditar.Enabled = false;
            btnEliminar.Enabled = false;
        }

     

        private void btnAddStudent_Click(object sender, EventArgs e)
        {
            frmInscribirAlumno_apoderado inscAl = new frmInscribirAlumno_apoderado();
            inscAl.Visible = true;
            inscAl.Show();
        }

        private void dgvAlumnos_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            
            btnEditar.Enabled = true;
            btnEliminar.Enabled = true;
            //obtener el dato de la fila para poder editarlo o eliminarlo de la bd
            int index = dgvAlumnos.CurrentCell.RowIndex;
            Alumno al  = (Alumno)dgvAlumnos.CurrentRow.Cells[index].Value;
        }

        class Alumno
                {
                    private string nombreCompleto;
                    private int grado;
                    private char condicion;
            
                    public Alumno(String nombreCompleto, int grado, char condicion)
                    {
                        this.nombreCompleto = nombreCompleto;
                        this.grado = grado;
                        this.condicion = condicion;
                    }

                    public string NombreCompleto { get => nombreCompleto; set => nombreCompleto = value; }
                    public int Grado { get => grado; set => grado = value; }
                    public char Condicion { get => condicion; set => condicion = value; }
                }
    }   
}
