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
    public partial class frmGestionarCursoPorSeccion : Form
    {
        FormGestionarCursos refParent;
        public frmGestionarCursoPorSeccion()
        {
            InitializeComponent();
        }

        public class tempGrado
        {
            private int id;
            private int grado;
            private int totalAlumn;
            private String seccion;

            public tempGrado(int grado, int totalAlumn, string seccion)
            {
                this.grado = grado;
                this.totalAlumn = totalAlumn;
                this.seccion = seccion;
            }

            public int ID
            {
                get
                {
                    return id;
                }
                set
                {
                    id = value;
                }
            }

            public int Grado
            {
                get
                {
                    return grado;
                }
                set
                {
                    grado = value;
                }
            }

            public int TotalAlumn
            {
                get
                {
                    return totalAlumn;
                }
                set
                {
                    totalAlumn = value;
                }
            }

            public String Seccion
            {
                get
                {
                    return seccion;
                }
                set
                {
                    seccion = value;
                }
            }
        }

        public class tempCurso
        {
            private int id;
            private String nombre;
            private int grado;
            private DateTime horaInicio;
            private DateTime horaFin;

            public tempCurso(string nombre, int grado)
            {
                this.nombre = nombre;
                this.grado = grado;
            }

            public int ID
            {
                get
                {
                    return id;
                }
                set
                {
                    id = value;
                }
            }

            public String Nombre
            {
                get
                {
                    return nombre;
                }
                set
                {
                    nombre = value;
                }
            }

            public int Grado
            {
                get
                {
                    return grado;
                }
                set
                {
                    grado = value;
                }
            }

            public DateTime HoraInicio
            {
                get
                {
                    return horaInicio;
                }
                set
                {
                    horaInicio = value;
                }
            }

            public DateTime HoraFin
            {
                get
                {
                    return horaFin;
                }
                set
                {
                    horaFin = value;
                }
            }
        }

        private void FrmGestionarCursoPorSeccion_FormClosing(object sender, FormClosingEventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }

        private void Button2_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.OK;
        }
    }
}
