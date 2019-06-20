namespace Sistemas_Malvarado
{
    partial class frmMatricularAlumnos_secretario_
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
            this.dgvMatricula = new System.Windows.Forms.DataGridView();
            this.btnMatricular = new System.Windows.Forms.Button();
            this.btnSeleccionarTodo = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.Matricula = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.Names = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dni = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Section = new System.Windows.Forms.DataGridViewComboBoxColumn();
            this.Guardian = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ticketEnrollment = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dgvMatricula)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvMatricula
            // 
            this.dgvMatricula.AllowUserToAddRows = false;
            this.dgvMatricula.AllowUserToDeleteRows = false;
            this.dgvMatricula.AllowUserToResizeColumns = false;
            this.dgvMatricula.AllowUserToResizeRows = false;
            this.dgvMatricula.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvMatricula.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Matricula,
            this.Names,
            this.dni,
            this.Section,
            this.Guardian,
            this.ticketEnrollment});
            this.dgvMatricula.Location = new System.Drawing.Point(26, 84);
            this.dgvMatricula.Name = "dgvMatricula";
            this.dgvMatricula.RowHeadersVisible = false;
            this.dgvMatricula.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvMatricula.Size = new System.Drawing.Size(663, 359);
            this.dgvMatricula.TabIndex = 0;
            // 
            // btnMatricular
            // 
            this.btnMatricular.Location = new System.Drawing.Point(555, 473);
            this.btnMatricular.Name = "btnMatricular";
            this.btnMatricular.Size = new System.Drawing.Size(134, 23);
            this.btnMatricular.TabIndex = 1;
            this.btnMatricular.Text = "Matricular Alumnos";
            this.btnMatricular.UseVisualStyleBackColor = true;
            // 
            // btnSeleccionarTodo
            // 
            this.btnSeleccionarTodo.Location = new System.Drawing.Point(26, 30);
            this.btnSeleccionarTodo.Name = "btnSeleccionarTodo";
            this.btnSeleccionarTodo.Size = new System.Drawing.Size(134, 23);
            this.btnSeleccionarTodo.TabIndex = 2;
            this.btnSeleccionarTodo.Text = "Seleccionar Todo";
            this.btnSeleccionarTodo.UseVisualStyleBackColor = true;
            this.btnSeleccionarTodo.Click += new System.EventHandler(this.btnSeleccionarTodo_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(197, 30);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(134, 23);
            this.button2.TabIndex = 3;
            this.button2.Text = "Deseleccionar Todo";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // Matricula
            // 
            this.Matricula.FillWeight = 152.2843F;
            this.Matricula.HeaderText = "";
            this.Matricula.Name = "Matricula";
            this.Matricula.ReadOnly = true;
            this.Matricula.Width = 40;
            // 
            // Names
            // 
            this.Names.FillWeight = 89.54314F;
            this.Names.HeaderText = "Nombre Alumno";
            this.Names.Name = "Names";
            this.Names.ReadOnly = true;
            this.Names.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.Names.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.Names.Width = 160;
            // 
            // dni
            // 
            this.dni.FillWeight = 89.54314F;
            this.dni.HeaderText = "dni";
            this.dni.Name = "dni";
            this.dni.ReadOnly = true;
            this.dni.Width = 80;
            // 
            // Section
            // 
            this.Section.FillWeight = 89.54314F;
            this.Section.HeaderText = "Seccion";
            this.Section.Name = "Section";
            this.Section.ReadOnly = true;
            this.Section.Width = 97;
            // 
            // Guardian
            // 
            this.Guardian.FillWeight = 89.54314F;
            this.Guardian.HeaderText = "Apoderado(a)";
            this.Guardian.Name = "Guardian";
            this.Guardian.ReadOnly = true;
            this.Guardian.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.Guardian.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.Guardian.Width = 160;
            // 
            // ticketEnrollment
            // 
            this.ticketEnrollment.FillWeight = 89.54314F;
            this.ticketEnrollment.HeaderText = "ticket";
            this.ticketEnrollment.Name = "ticketEnrollment";
            this.ticketEnrollment.ReadOnly = true;
            this.ticketEnrollment.Width = 120;
            // 
            // frmMatricularAlumnos_secretario_
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(728, 508);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.btnSeleccionarTodo);
            this.Controls.Add(this.btnMatricular);
            this.Controls.Add(this.dgvMatricula);
            this.Name = "frmMatricularAlumnos_secretario_";
            this.Text = "frmMatricularAlumnos_secretario_";
            ((System.ComponentModel.ISupportInitialize)(this.dgvMatricula)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dgvMatricula;
        private System.Windows.Forms.Button btnMatricular;
        private System.Windows.Forms.Button btnSeleccionarTodo;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.DataGridViewCheckBoxColumn Matricula;
        private System.Windows.Forms.DataGridViewTextBoxColumn Names;
        private System.Windows.Forms.DataGridViewTextBoxColumn dni;
        private System.Windows.Forms.DataGridViewComboBoxColumn Section;
        private System.Windows.Forms.DataGridViewTextBoxColumn Guardian;
        private System.Windows.Forms.DataGridViewTextBoxColumn ticketEnrollment;
    }
}