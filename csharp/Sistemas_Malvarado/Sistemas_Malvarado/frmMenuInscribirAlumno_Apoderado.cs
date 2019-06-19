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
        //private Student _student;
        public frmMenuInscribirAlumno_Apoderado()
        {
            InitializeComponent();
            btnEditar.Enabled = false;
            btnEliminar.Enabled = false;
        }

        private void refreshDGV()
        {
            //dgvAlumnosInscritos.DataSource = ;
        }

        private void btnInscribir_Click(object sender, EventArgs e)
        {
            frmInscribirAlumno_apoderado formulario = new frmInscribirAlumno_apoderado();
            if (formulario.ShowDialog() == DialogResult.OK) { 
                btnEditar.Enabled = false;
                btnEliminar.Enabled = false;
            }
        }

        private void dgvAlumnosInscritos_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            //_student.DNI= dgvAlumnosInscritos.Rows[posActual].Cells[0].Value;

            int columnaActual = dgvAlumnosInscritos.CurrentCell.ColumnIndex;
            if (columnaActual == 4)
            {
                frmMatricularAlumno_Apoderado_ formulario = new frmMatricularAlumno_Apoderado_();
                if (formulario.ShowDialog() == DialogResult.OK)
                {
                    //int filaActual = dgvAlumnosInscritos.CurrentCell.ColumnIndex;

                    refreshDGV();
                }
            }
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            frmInscribirAlumno_apoderado formulario = new frmInscribirAlumno_apoderado();
            if (formulario.ShowDialog() == DialogResult.OK)
            {
                //DBController.queryStudentByID(_student.getIdStudent)
            }
        }


    }
}
