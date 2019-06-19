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
        MAlvaradoWS.course curso = new MAlvaradoWS.course();
        MAlvaradoWS.grade grade = new MAlvaradoWS.grade();
         

        private MAlvaradoWS.DBControllerWSClient controller;

        public frmGestionarTipoNota_secretario_(MAlvaradoWS.course c)
        {
            InitializeComponent();
            this.curso = c;
            this.grade.course = new MAlvaradoWS.course();
            this.grade.course = this.curso;
            cambiarEstado(EstadosFrmGestionarTipoNota.Buscar);
            txtNombreCurso.Text = curso.name;
            
            controller = new MAlvaradoWS.DBControllerWSClient();

            dgvCursos.AutoGenerateColumns = false;
            //dgvCursos.DataSource = controller.queryAllGrades();
            dgvCursos.DataSource = controller.queryGradesByCourseId(this.curso.id);


        }

        private void cambiarEstado(EstadosFrmGestionarTipoNota e)
        {
            if(e == EstadosFrmGestionarTipoNota.Buscar)
            {
                this.estado = EstadosFrmGestionarTipoNota.Buscar;
                txtPeso.Enabled = false;
                btnNuevo.Enabled = true;
                btnAgregar.Enabled = false;
                btnAgregar.Text = "&Agregar";
                btnEliminar.Enabled = false;
                
            }
            else if(e == EstadosFrmGestionarTipoNota.Nuevo)
            {
                this.estado = EstadosFrmGestionarTipoNota.Nuevo;
                txtDescripcion.Text = "";
                txtPeso.Enabled = true;
                txtPeso.Text = "";
                btnNuevo.Enabled = false;
                btnAgregar.Enabled = true;
                btnAgregar.Text = "&Agregar";
                btnEliminar.Enabled = false;

            }
            else if(e == EstadosFrmGestionarTipoNota.Editar)
            {
                this.estado = EstadosFrmGestionarTipoNota.Editar;
                txtPeso.Enabled = true;
                btnNuevo.Enabled = false;
                btnAgregar.Enabled = true;
                btnAgregar.Text = "&Actualizar";
                btnEliminar.Enabled = true;

            }
        }

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            cambiarEstado(EstadosFrmGestionarTipoNota.Nuevo);
        }

        private void editarGrade(object sender, DataGridViewCellEventArgs e)
        {
            cambiarEstado(EstadosFrmGestionarTipoNota.Editar);
            this.grade = (MAlvaradoWS.grade) dgvCursos.CurrentRow.DataBoundItem;
            txtDescripcion.Text = grade.description;
            txtPeso.Text = grade.weight.ToString();
            
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            
            if(this.estado == EstadosFrmGestionarTipoNota.Nuevo)
            {
                this.grade.description = txtDescripcion.Text;
                this.grade.weight = Double.Parse( txtPeso.Text);
                var result = MessageBox.Show("¿Está seguro que desea agregar el nuevo tipo de nota?", "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                if(result == DialogResult.Yes)
                    controller.insertGRade(this.grade);

            }else if(this.estado == EstadosFrmGestionarTipoNota.Editar)
            {
                this.grade.description = txtDescripcion.Text;
                this.grade.weight = Double.Parse(txtPeso.Text);
                var result = MessageBox.Show("¿Está seguro que desea actualizar el tipo de nota?", "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                if (result == DialogResult.Yes)
                    controller.updateGRade(this.grade);
            }
            //dgvCursos.DataSource = controller.queryAllGrades();
            dgvCursos.DataSource = controller.queryGradesByCourseId(this.curso.id);
            cambiarEstado(EstadosFrmGestionarTipoNota.Buscar);
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            this.grade = (MAlvaradoWS.grade)dgvCursos.CurrentRow.DataBoundItem;
            var result = MessageBox.Show("¿Está seguro que desea eliminar el tipo de nota?", "Confirmación", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (result == DialogResult.Yes)
                controller.deleteGRade(grade);
            //dgvCursos.DataSource = controller.queryAllGrades();
            dgvCursos.DataSource = controller.queryGradesByCourseId(this.curso.id);
            cambiarEstado(EstadosFrmGestionarTipoNota.Buscar);
        }

        private void frmGestionarTipoNota_secretario__Load(object sender, EventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            dgvCursos.DataSource = controller.queryGradesSearchByName(txtDescripcion.Text, this.curso.id);
        }
    }
}
