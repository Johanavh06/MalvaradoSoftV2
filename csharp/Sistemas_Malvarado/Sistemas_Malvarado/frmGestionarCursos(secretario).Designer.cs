namespace Sistemas_Malvarado
{
    partial class FormGestionarCursos
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormGestionarCursos));
            this.labelCursoNombre = new System.Windows.Forms.Label();
            this.textBoxCursoNombre = new System.Windows.Forms.TextBox();
            this.labelGrado = new System.Windows.Forms.Label();
            this.comboBoxGrado = new System.Windows.Forms.ComboBox();
            this.toolStripGestionarCurso = new System.Windows.Forms.ToolStrip();
            this.toolStripBtnArchivo = new System.Windows.Forms.ToolStripDropDownButton();
            this.salirToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripBtnOperaciones = new System.Windows.Forms.ToolStripDropDownButton();
            this.seccionesACargoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.gestionarCursoPorHorarioToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.dataGridViewGestionarCursos = new System.Windows.Forms.DataGridView();
            this.btnAgregarGestionarCurso = new System.Windows.Forms.Button();
            this.btmEliminar = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.toolStripGestionarCurso.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewGestionarCursos)).BeginInit();
            this.SuspendLayout();
            // 
            // labelCursoNombre
            // 
            this.labelCursoNombre.AutoSize = true;
            this.labelCursoNombre.Location = new System.Drawing.Point(27, 31);
            this.labelCursoNombre.Name = "labelCursoNombre";
            this.labelCursoNombre.Size = new System.Drawing.Size(34, 13);
            this.labelCursoNombre.TabIndex = 0;
            this.labelCursoNombre.Text = "Curso";
            // 
            // textBoxCursoNombre
            // 
            this.textBoxCursoNombre.Location = new System.Drawing.Point(120, 28);
            this.textBoxCursoNombre.Name = "textBoxCursoNombre";
            this.textBoxCursoNombre.Size = new System.Drawing.Size(240, 20);
            this.textBoxCursoNombre.TabIndex = 1;
            // 
            // labelGrado
            // 
            this.labelGrado.AutoSize = true;
            this.labelGrado.Location = new System.Drawing.Point(27, 61);
            this.labelGrado.Name = "labelGrado";
            this.labelGrado.Size = new System.Drawing.Size(36, 13);
            this.labelGrado.TabIndex = 2;
            this.labelGrado.Text = "Grado";
            // 
            // comboBoxGrado
            // 
            this.comboBoxGrado.FormattingEnabled = true;
            this.comboBoxGrado.Location = new System.Drawing.Point(120, 58);
            this.comboBoxGrado.Name = "comboBoxGrado";
            this.comboBoxGrado.Size = new System.Drawing.Size(240, 21);
            this.comboBoxGrado.TabIndex = 3;
            // 
            // toolStripGestionarCurso
            // 
            this.toolStripGestionarCurso.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripBtnArchivo,
            this.toolStripBtnOperaciones});
            this.toolStripGestionarCurso.Location = new System.Drawing.Point(0, 0);
            this.toolStripGestionarCurso.Name = "toolStripGestionarCurso";
            this.toolStripGestionarCurso.Size = new System.Drawing.Size(390, 25);
            this.toolStripGestionarCurso.TabIndex = 4;
            this.toolStripGestionarCurso.Text = "toolStrip1";
            // 
            // toolStripBtnArchivo
            // 
            this.toolStripBtnArchivo.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Text;
            this.toolStripBtnArchivo.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.salirToolStripMenuItem});
            this.toolStripBtnArchivo.Image = ((System.Drawing.Image)(resources.GetObject("toolStripBtnArchivo.Image")));
            this.toolStripBtnArchivo.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripBtnArchivo.Name = "toolStripBtnArchivo";
            this.toolStripBtnArchivo.Size = new System.Drawing.Size(61, 22);
            this.toolStripBtnArchivo.Text = "Archivo";
            this.toolStripBtnArchivo.ToolTipText = "Archivo";
            // 
            // salirToolStripMenuItem
            // 
            this.salirToolStripMenuItem.Name = "salirToolStripMenuItem";
            this.salirToolStripMenuItem.Size = new System.Drawing.Size(96, 22);
            this.salirToolStripMenuItem.Text = "Salir";
            this.salirToolStripMenuItem.Click += new System.EventHandler(this.salirToolStripMenuItem_Click);
            // 
            // toolStripBtnOperaciones
            // 
            this.toolStripBtnOperaciones.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Text;
            this.toolStripBtnOperaciones.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.seccionesACargoToolStripMenuItem,
            this.gestionarCursoPorHorarioToolStripMenuItem});
            this.toolStripBtnOperaciones.Image = ((System.Drawing.Image)(resources.GetObject("toolStripBtnOperaciones.Image")));
            this.toolStripBtnOperaciones.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripBtnOperaciones.Name = "toolStripBtnOperaciones";
            this.toolStripBtnOperaciones.Size = new System.Drawing.Size(86, 22);
            this.toolStripBtnOperaciones.Text = "Operaciones";
            // 
            // seccionesACargoToolStripMenuItem
            // 
            this.seccionesACargoToolStripMenuItem.Name = "seccionesACargoToolStripMenuItem";
            this.seccionesACargoToolStripMenuItem.Size = new System.Drawing.Size(222, 22);
            this.seccionesACargoToolStripMenuItem.Text = "Secciones a Cargo";
            this.seccionesACargoToolStripMenuItem.Click += new System.EventHandler(this.seccionesACargoToolStripMenuItem_Click);
            // 
            // gestionarCursoPorHorarioToolStripMenuItem
            // 
            this.gestionarCursoPorHorarioToolStripMenuItem.Name = "gestionarCursoPorHorarioToolStripMenuItem";
            this.gestionarCursoPorHorarioToolStripMenuItem.Size = new System.Drawing.Size(222, 22);
            this.gestionarCursoPorHorarioToolStripMenuItem.Text = "Gestionar Curso por Horario";
            this.gestionarCursoPorHorarioToolStripMenuItem.Click += new System.EventHandler(this.gestionarCursoPorHorarioToolStripMenuItem_Click);
            // 
            // dataGridViewGestionarCursos
            // 
            this.dataGridViewGestionarCursos.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewGestionarCursos.Location = new System.Drawing.Point(12, 142);
            this.dataGridViewGestionarCursos.Name = "dataGridViewGestionarCursos";
            this.dataGridViewGestionarCursos.Size = new System.Drawing.Size(359, 283);
            this.dataGridViewGestionarCursos.TabIndex = 5;
            // 
            // btnAgregarGestionarCurso
            // 
            this.btnAgregarGestionarCurso.Location = new System.Drawing.Point(12, 104);
            this.btnAgregarGestionarCurso.Name = "btnAgregarGestionarCurso";
            this.btnAgregarGestionarCurso.Size = new System.Drawing.Size(75, 23);
            this.btnAgregarGestionarCurso.TabIndex = 6;
            this.btnAgregarGestionarCurso.Text = "Agregar";
            this.btnAgregarGestionarCurso.UseVisualStyleBackColor = true;
            this.btnAgregarGestionarCurso.Click += new System.EventHandler(this.btnAgregarGestionarCurso_Click);
            // 
            // btmEliminar
            // 
            this.btmEliminar.Location = new System.Drawing.Point(296, 104);
            this.btmEliminar.Name = "btmEliminar";
            this.btmEliminar.Size = new System.Drawing.Size(75, 23);
            this.btmEliminar.TabIndex = 8;
            this.btmEliminar.Text = "Eliminar";
            this.btmEliminar.UseVisualStyleBackColor = true;
            this.btmEliminar.Click += new System.EventHandler(this.btmEliminar_Click);
            // 
            // button1
            // 
            this.button1.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(45)))), ((int)(((byte)(45)))), ((int)(((byte)(48)))));
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Image = ((System.Drawing.Image)(resources.GetObject("button1.Image")));
            this.button1.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button1.Location = new System.Drawing.Point(250, 431);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(121, 35);
            this.button1.TabIndex = 9;
            this.button1.Text = "Close";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // FormGestionarCursos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(390, 478);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.btmEliminar);
            this.Controls.Add(this.btnAgregarGestionarCurso);
            this.Controls.Add(this.dataGridViewGestionarCursos);
            this.Controls.Add(this.toolStripGestionarCurso);
            this.Controls.Add(this.comboBoxGrado);
            this.Controls.Add(this.labelGrado);
            this.Controls.Add(this.textBoxCursoNombre);
            this.Controls.Add(this.labelCursoNombre);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FormGestionarCursos";
            this.Text = "Gestionar Cursos";
            this.Load += new System.EventHandler(this.FormGestionarCursos_Load);
            this.toolStripGestionarCurso.ResumeLayout(false);
            this.toolStripGestionarCurso.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewGestionarCursos)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labelCursoNombre;
        private System.Windows.Forms.TextBox textBoxCursoNombre;
        private System.Windows.Forms.Label labelGrado;
        private System.Windows.Forms.ComboBox comboBoxGrado;
        private System.Windows.Forms.ToolStrip toolStripGestionarCurso;
        private System.Windows.Forms.DataGridView dataGridViewGestionarCursos;
        private System.Windows.Forms.Button btnAgregarGestionarCurso;
        private System.Windows.Forms.Button btmEliminar;
        private System.Windows.Forms.ToolStripDropDownButton toolStripBtnArchivo;
        private System.Windows.Forms.ToolStripMenuItem salirToolStripMenuItem;
        private System.Windows.Forms.ToolStripDropDownButton toolStripBtnOperaciones;
        private System.Windows.Forms.ToolStripMenuItem seccionesACargoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem gestionarCursoPorHorarioToolStripMenuItem;
        private System.Windows.Forms.Button button1;
    }
}