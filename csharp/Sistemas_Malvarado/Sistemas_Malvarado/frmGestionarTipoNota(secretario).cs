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
    public partial class frmGestionarTipoNota_secretario_ : Form
    {

        EstadosFrmGestionarTipoNota estado = EstadosFrmGestionarTipoNota.Buscar;

        private MAlvaradoWS.DBControllerWSClient controller;

        public frmGestionarTipoNota_secretario_(MAlvaradoWS.course curso)
        {
            InitializeComponent();
            cambiarEstado(EstadosFrmGestionarTipoNota.Buscar);
            txtNombreCurso.Text = curso.name;
            
            controller = new MAlvaradoWS.DBControllerWSClient();

            dgvCursos.AutoGenerateColumns = false;
            dgvCursos.DataSource = controller.queryAllGrades();
            

        }

        private void cambiarEstado(EstadosFrmGestionarTipoNota estado)
        {
            if(estado == EstadosFrmGestionarTipoNota.Buscar)
            {
                txtPeso.Enabled = false;
                btnNuevo.Enabled = true;
                btnAgregar.Enabled = false;
                btnEliminar.Enabled = false;
                btnAgregar.Text = "&Agregar";
            }
            else if(estado == EstadosFrmGestionarTipoNota.Nuevo)
            {
                txtDescripcion.Text = "";
                txtPeso.Enabled = true;
                btnEliminar.Enabled = false;
                btnNuevo.Enabled = false;
                btnAgregar.Enabled = true;
                
                txtPeso.Text = "";
                btnAgregar.Text = "&Agregar";

            }
            else if(estado == EstadosFrmGestionarTipoNota.Editar)
            {
                txtPeso.Enabled = true;
                btnEliminar.Enabled = true;
                btnAgregar.Text = "&Actualizar";
                btnAgregar.Enabled = true;

            }
        }

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            cambiarEstado(EstadosFrmGestionarTipoNota.Nuevo);
        }

        private void editarGrade(object sender, DataGridViewCellEventArgs e)
        {
            cambiarEstado(EstadosFrmGestionarTipoNota.Editar);
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            cambiarEstado(EstadosFrmGestionarTipoNota.Buscar);
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            cambiarEstado(EstadosFrmGestionarTipoNota.Buscar);
        }
    }
}
