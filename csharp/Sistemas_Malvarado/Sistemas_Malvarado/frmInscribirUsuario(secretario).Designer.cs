namespace Sistemas_Malvarado
{
    partial class frmInscribirUsuario_secretario_
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmInscribirUsuario_secretario_));
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle5 = new System.Windows.Forms.DataGridViewCellStyle();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.gbTipoUsuario = new System.Windows.Forms.GroupBox();
            this.ckProfesor = new System.Windows.Forms.CheckBox();
            this.ckSecretaria = new System.Windows.Forms.CheckBox();
            this.ckAuxiliar = new System.Windows.Forms.CheckBox();
            this.ckAlumno = new System.Windows.Forms.CheckBox();
            this.ckApoderado = new System.Windows.Forms.CheckBox();
            this.btnAceptar = new System.Windows.Forms.Button();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.gbDatosGenerales = new System.Windows.Forms.GroupBox();
            this.txtEmail = new System.Windows.Forms.TextBox();
            this.btnBuscarUsuario = new System.Windows.Forms.Button();
            this.txtTel = new System.Windows.Forms.TextBox();
            this.txtApMat = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.txtApDir = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.txtApPat = new System.Windows.Forms.TextBox();
            this.txtNombre = new System.Windows.Forms.TextBox();
            this.txtDNI = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.tabAlumno = new System.Windows.Forms.TabPage();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.comboBox2 = new System.Windows.Forms.ComboBox();
            this.comboBox3 = new System.Windows.Forms.ComboBox();
            this.label12 = new System.Windows.Forms.Label();
            this.dgvUsuarios = new System.Windows.Forms.DataGridView();
            this.tabUsers = new System.Windows.Forms.TabControl();
            this.dataGridViewTextBoxColumn13 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn12 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn11 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn10 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn9 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn8 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DNI = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Nombre = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ApPat = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ApMat = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Direccion = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.telefono = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.email = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.gbTipoUsuario.SuspendLayout();
            this.gbDatosGenerales.SuspendLayout();
            this.tabAlumno.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvUsuarios)).BeginInit();
            this.tabUsers.SuspendLayout();
            this.SuspendLayout();
            // 
            // btnEliminar
            // 
            this.btnEliminar.Enabled = false;
            this.btnEliminar.Location = new System.Drawing.Point(248, 352);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(110, 23);
            this.btnEliminar.TabIndex = 35;
            this.btnEliminar.Text = "Eliminar";
            this.btnEliminar.UseVisualStyleBackColor = true;
            // 
            // gbTipoUsuario
            // 
            this.gbTipoUsuario.Controls.Add(this.ckProfesor);
            this.gbTipoUsuario.Controls.Add(this.ckSecretaria);
            this.gbTipoUsuario.Controls.Add(this.ckAuxiliar);
            this.gbTipoUsuario.Controls.Add(this.ckAlumno);
            this.gbTipoUsuario.Controls.Add(this.ckApoderado);
            this.gbTipoUsuario.Location = new System.Drawing.Point(12, 12);
            this.gbTipoUsuario.Name = "gbTipoUsuario";
            this.gbTipoUsuario.Size = new System.Drawing.Size(597, 47);
            this.gbTipoUsuario.TabIndex = 34;
            this.gbTipoUsuario.TabStop = false;
            this.gbTipoUsuario.Text = "Tipo Usuario";
            // 
            // ckProfesor
            // 
            this.ckProfesor.AutoSize = true;
            this.ckProfesor.Location = new System.Drawing.Point(509, 19);
            this.ckProfesor.Name = "ckProfesor";
            this.ckProfesor.Size = new System.Drawing.Size(65, 17);
            this.ckProfesor.TabIndex = 13;
            this.ckProfesor.Text = "Profesor";
            this.ckProfesor.UseVisualStyleBackColor = true;
            this.ckProfesor.CheckedChanged += new System.EventHandler(this.ckProfesor_CheckedChanged);
            // 
            // ckSecretaria
            // 
            this.ckSecretaria.AutoSize = true;
            this.ckSecretaria.Location = new System.Drawing.Point(379, 19);
            this.ckSecretaria.Name = "ckSecretaria";
            this.ckSecretaria.Size = new System.Drawing.Size(74, 17);
            this.ckSecretaria.TabIndex = 12;
            this.ckSecretaria.Text = "Secretaria";
            this.ckSecretaria.UseVisualStyleBackColor = true;
            this.ckSecretaria.CheckedChanged += new System.EventHandler(this.ckSecretaria_CheckedChanged);
            // 
            // ckAuxiliar
            // 
            this.ckAuxiliar.AutoSize = true;
            this.ckAuxiliar.Location = new System.Drawing.Point(264, 19);
            this.ckAuxiliar.Name = "ckAuxiliar";
            this.ckAuxiliar.Size = new System.Drawing.Size(59, 17);
            this.ckAuxiliar.TabIndex = 11;
            this.ckAuxiliar.Text = "Auxiliar";
            this.ckAuxiliar.UseVisualStyleBackColor = true;
            this.ckAuxiliar.CheckedChanged += new System.EventHandler(this.ckAuxiliar_CheckedChanged);
            // 
            // ckAlumno
            // 
            this.ckAlumno.AutoSize = true;
            this.ckAlumno.Location = new System.Drawing.Point(147, 19);
            this.ckAlumno.Name = "ckAlumno";
            this.ckAlumno.Size = new System.Drawing.Size(61, 17);
            this.ckAlumno.TabIndex = 9;
            this.ckAlumno.Text = "Alumno";
            this.ckAlumno.UseVisualStyleBackColor = true;
            this.ckAlumno.CheckedChanged += new System.EventHandler(this.ckAlumno_CheckedChanged);
            // 
            // ckApoderado
            // 
            this.ckApoderado.AutoSize = true;
            this.ckApoderado.Location = new System.Drawing.Point(13, 19);
            this.ckApoderado.Name = "ckApoderado";
            this.ckApoderado.Size = new System.Drawing.Size(78, 17);
            this.ckApoderado.TabIndex = 8;
            this.ckApoderado.Text = "Apoderado";
            this.ckApoderado.UseVisualStyleBackColor = true;
            this.ckApoderado.CheckedChanged += new System.EventHandler(this.ckApoderado_CheckedChanged);
            // 
            // btnAceptar
            // 
            this.btnAceptar.Location = new System.Drawing.Point(500, 352);
            this.btnAceptar.Name = "btnAceptar";
            this.btnAceptar.Size = new System.Drawing.Size(110, 23);
            this.btnAceptar.TabIndex = 33;
            this.btnAceptar.Text = "Aceptar";
            this.btnAceptar.UseVisualStyleBackColor = true;
            this.btnAceptar.Click += new System.EventHandler(this.btnAceptar_Click);
            // 
            // btnCancelar
            // 
            this.btnCancelar.Location = new System.Drawing.Point(12, 352);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(110, 23);
            this.btnCancelar.TabIndex = 32;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = true;
            // 
            // gbDatosGenerales
            // 
            this.gbDatosGenerales.Controls.Add(this.txtEmail);
            this.gbDatosGenerales.Controls.Add(this.btnBuscarUsuario);
            this.gbDatosGenerales.Controls.Add(this.txtTel);
            this.gbDatosGenerales.Controls.Add(this.txtApMat);
            this.gbDatosGenerales.Controls.Add(this.label8);
            this.gbDatosGenerales.Controls.Add(this.label7);
            this.gbDatosGenerales.Controls.Add(this.txtApDir);
            this.gbDatosGenerales.Controls.Add(this.label6);
            this.gbDatosGenerales.Controls.Add(this.txtApPat);
            this.gbDatosGenerales.Controls.Add(this.txtNombre);
            this.gbDatosGenerales.Controls.Add(this.txtDNI);
            this.gbDatosGenerales.Controls.Add(this.label5);
            this.gbDatosGenerales.Controls.Add(this.label4);
            this.gbDatosGenerales.Controls.Add(this.label3);
            this.gbDatosGenerales.Controls.Add(this.label2);
            this.gbDatosGenerales.Location = new System.Drawing.Point(12, 65);
            this.gbDatosGenerales.Name = "gbDatosGenerales";
            this.gbDatosGenerales.Size = new System.Drawing.Size(597, 271);
            this.gbDatosGenerales.TabIndex = 30;
            this.gbDatosGenerales.TabStop = false;
            this.gbDatosGenerales.Text = "Datos Generales";
            // 
            // txtEmail
            // 
            this.txtEmail.Location = new System.Drawing.Point(126, 222);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(379, 20);
            this.txtEmail.TabIndex = 10;
            // 
            // btnBuscarUsuario
            // 
            this.btnBuscarUsuario.Image = ((System.Drawing.Image)(resources.GetObject("btnBuscarUsuario.Image")));
            this.btnBuscarUsuario.Location = new System.Drawing.Point(524, 10);
            this.btnBuscarUsuario.Name = "btnBuscarUsuario";
            this.btnBuscarUsuario.Size = new System.Drawing.Size(65, 33);
            this.btnBuscarUsuario.TabIndex = 24;
            this.btnBuscarUsuario.UseVisualStyleBackColor = true;
            this.btnBuscarUsuario.Click += new System.EventHandler(this.btnBuscarUsuario_Click);
            // 
            // txtTel
            // 
            this.txtTel.Location = new System.Drawing.Point(126, 190);
            this.txtTel.Name = "txtTel";
            this.txtTel.Size = new System.Drawing.Size(379, 20);
            this.txtTel.TabIndex = 9;
            // 
            // txtApMat
            // 
            this.txtApMat.Location = new System.Drawing.Point(126, 126);
            this.txtApMat.Name = "txtApMat";
            this.txtApMat.Size = new System.Drawing.Size(379, 20);
            this.txtApMat.TabIndex = 9;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(17, 161);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(52, 13);
            this.label8.TabIndex = 8;
            this.label8.Text = "Dirección";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(17, 193);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(39, 13);
            this.label7.TabIndex = 7;
            this.label7.Text = "Celular";
            // 
            // txtApDir
            // 
            this.txtApDir.Location = new System.Drawing.Point(126, 158);
            this.txtApDir.Name = "txtApDir";
            this.txtApDir.Size = new System.Drawing.Size(379, 20);
            this.txtApDir.TabIndex = 5;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(17, 225);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(32, 13);
            this.label6.TabIndex = 6;
            this.label6.Text = "Email";
            // 
            // txtApPat
            // 
            this.txtApPat.Location = new System.Drawing.Point(126, 94);
            this.txtApPat.Name = "txtApPat";
            this.txtApPat.Size = new System.Drawing.Size(379, 20);
            this.txtApPat.TabIndex = 5;
            // 
            // txtNombre
            // 
            this.txtNombre.Location = new System.Drawing.Point(126, 62);
            this.txtNombre.Name = "txtNombre";
            this.txtNombre.Size = new System.Drawing.Size(379, 20);
            this.txtNombre.TabIndex = 4;
            // 
            // txtDNI
            // 
            this.txtDNI.Location = new System.Drawing.Point(126, 30);
            this.txtDNI.Name = "txtDNI";
            this.txtDNI.Size = new System.Drawing.Size(379, 20);
            this.txtDNI.TabIndex = 4;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(17, 65);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(44, 13);
            this.label5.TabIndex = 3;
            this.label5.Text = "Nombre";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(17, 97);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(84, 13);
            this.label4.TabIndex = 2;
            this.label4.Text = "Apellido Paterno";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(17, 129);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(86, 13);
            this.label3.TabIndex = 1;
            this.label3.Text = "Apellido Materno";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(17, 33);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(26, 13);
            this.label2.TabIndex = 0;
            this.label2.Text = "DNI";
            // 
            // tabAlumno
            // 
            this.tabAlumno.Controls.Add(this.dgvUsuarios);
            this.tabAlumno.Controls.Add(this.label12);
            this.tabAlumno.Controls.Add(this.comboBox3);
            this.tabAlumno.Controls.Add(this.comboBox2);
            this.tabAlumno.Controls.Add(this.label10);
            this.tabAlumno.Controls.Add(this.label9);
            this.tabAlumno.Location = new System.Drawing.Point(4, 22);
            this.tabAlumno.Name = "tabAlumno";
            this.tabAlumno.Padding = new System.Windows.Forms.Padding(3);
            this.tabAlumno.Size = new System.Drawing.Size(589, 261);
            this.tabAlumno.TabIndex = 1;
            this.tabAlumno.Text = "Alumno";
            this.tabAlumno.UseVisualStyleBackColor = true;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(24, 21);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(36, 13);
            this.label9.TabIndex = 42;
            this.label9.Text = "Grado";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(24, 53);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(54, 13);
            this.label10.TabIndex = 44;
            this.label10.Text = "Condición";
            // 
            // comboBox2
            // 
            this.comboBox2.FormattingEnabled = true;
            this.comboBox2.Location = new System.Drawing.Point(116, 18);
            this.comboBox2.Name = "comboBox2";
            this.comboBox2.Size = new System.Drawing.Size(121, 21);
            this.comboBox2.TabIndex = 46;
            // 
            // comboBox3
            // 
            this.comboBox3.FormattingEnabled = true;
            this.comboBox3.Location = new System.Drawing.Point(116, 50);
            this.comboBox3.Name = "comboBox3";
            this.comboBox3.Size = new System.Drawing.Size(121, 21);
            this.comboBox3.TabIndex = 47;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(24, 99);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(73, 13);
            this.label12.TabIndex = 48;
            this.label12.Text = "Apoderado/a:";
            // 
            // dgvUsuarios
            // 
            this.dgvUsuarios.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dgvUsuarios.AutoSizeRowsMode = System.Windows.Forms.DataGridViewAutoSizeRowsMode.DisplayedCells;
            this.dgvUsuarios.BackgroundColor = System.Drawing.SystemColors.Info;
            dataGridViewCellStyle5.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle5.BackColor = System.Drawing.SystemColors.ActiveBorder;
            dataGridViewCellStyle5.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle5.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle5.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle5.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle5.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dgvUsuarios.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle5;
            this.dgvUsuarios.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvUsuarios.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.DNI,
            this.Nombre,
            this.ApPat,
            this.ApMat,
            this.Direccion,
            this.telefono,
            this.email});
            this.dgvUsuarios.Location = new System.Drawing.Point(16, 118);
            this.dgvUsuarios.Name = "dgvUsuarios";
            this.dgvUsuarios.ReadOnly = true;
            this.dgvUsuarios.RowHeadersVisible = false;
            this.dgvUsuarios.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvUsuarios.Size = new System.Drawing.Size(564, 114);
            this.dgvUsuarios.TabIndex = 49;
            // 
            // tabUsers
            // 
            this.tabUsers.Controls.Add(this.tabAlumno);
            this.tabUsers.Location = new System.Drawing.Point(12, 392);
            this.tabUsers.Name = "tabUsers";
            this.tabUsers.SelectedIndex = 0;
            this.tabUsers.Size = new System.Drawing.Size(597, 287);
            this.tabUsers.TabIndex = 31;
            // 
            // dataGridViewTextBoxColumn13
            // 
            this.dataGridViewTextBoxColumn13.HeaderText = "e-mail";
            this.dataGridViewTextBoxColumn13.Name = "dataGridViewTextBoxColumn13";
            this.dataGridViewTextBoxColumn13.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn12
            // 
            this.dataGridViewTextBoxColumn12.HeaderText = "phone";
            this.dataGridViewTextBoxColumn12.Name = "dataGridViewTextBoxColumn12";
            this.dataGridViewTextBoxColumn12.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn11
            // 
            this.dataGridViewTextBoxColumn11.HeaderText = "Sección";
            this.dataGridViewTextBoxColumn11.Name = "dataGridViewTextBoxColumn11";
            this.dataGridViewTextBoxColumn11.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn10
            // 
            this.dataGridViewTextBoxColumn10.HeaderText = "Condición";
            this.dataGridViewTextBoxColumn10.Name = "dataGridViewTextBoxColumn10";
            this.dataGridViewTextBoxColumn10.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn9
            // 
            this.dataGridViewTextBoxColumn9.HeaderText = "Grado";
            this.dataGridViewTextBoxColumn9.Name = "dataGridViewTextBoxColumn9";
            this.dataGridViewTextBoxColumn9.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn8
            // 
            this.dataGridViewTextBoxColumn8.HeaderText = "Ap. Materno";
            this.dataGridViewTextBoxColumn8.Name = "dataGridViewTextBoxColumn8";
            this.dataGridViewTextBoxColumn8.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.HeaderText = "Ap. Paterno";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            this.dataGridViewTextBoxColumn4.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.HeaderText = "Nombre";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            this.dataGridViewTextBoxColumn3.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.HeaderText = "DNI";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // DNI
            // 
            this.DNI.HeaderText = "DNI";
            this.DNI.Name = "DNI";
            this.DNI.ReadOnly = true;
            // 
            // Nombre
            // 
            this.Nombre.HeaderText = "Nombre";
            this.Nombre.Name = "Nombre";
            this.Nombre.ReadOnly = true;
            // 
            // ApPat
            // 
            this.ApPat.HeaderText = "Ap. Paterno";
            this.ApPat.Name = "ApPat";
            this.ApPat.ReadOnly = true;
            // 
            // ApMat
            // 
            this.ApMat.HeaderText = "Ap. Materno";
            this.ApMat.Name = "ApMat";
            this.ApMat.ReadOnly = true;
            // 
            // Direccion
            // 
            this.Direccion.HeaderText = "Dirección";
            this.Direccion.Name = "Direccion";
            this.Direccion.ReadOnly = true;
            // 
            // telefono
            // 
            this.telefono.HeaderText = "Celular";
            this.telefono.Name = "telefono";
            this.telefono.ReadOnly = true;
            // 
            // email
            // 
            this.email.HeaderText = "E-mail";
            this.email.Name = "email";
            this.email.ReadOnly = true;
            // 
            // frmInscribirUsuario_secretario_
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(625, 691);
            this.Controls.Add(this.btnEliminar);
            this.Controls.Add(this.gbTipoUsuario);
            this.Controls.Add(this.btnAceptar);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.tabUsers);
            this.Controls.Add(this.gbDatosGenerales);
            this.Name = "frmInscribirUsuario_secretario_";
            this.Text = "frmInscribirUsuario_secretario_";
            this.gbTipoUsuario.ResumeLayout(false);
            this.gbTipoUsuario.PerformLayout();
            this.gbDatosGenerales.ResumeLayout(false);
            this.gbDatosGenerales.PerformLayout();
            this.tabAlumno.ResumeLayout(false);
            this.tabAlumno.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvUsuarios)).EndInit();
            this.tabUsers.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnEliminar;
        private System.Windows.Forms.GroupBox gbTipoUsuario;
        private System.Windows.Forms.CheckBox ckProfesor;
        private System.Windows.Forms.CheckBox ckSecretaria;
        private System.Windows.Forms.CheckBox ckAuxiliar;
        private System.Windows.Forms.CheckBox ckAlumno;
        private System.Windows.Forms.CheckBox ckApoderado;
        private System.Windows.Forms.Button btnAceptar;
        private System.Windows.Forms.Button btnCancelar;
        private System.Windows.Forms.GroupBox gbDatosGenerales;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.Button btnBuscarUsuario;
        private System.Windows.Forms.TextBox txtTel;
        private System.Windows.Forms.TextBox txtApMat;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox txtApDir;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox txtApPat;
        private System.Windows.Forms.TextBox txtNombre;
        private System.Windows.Forms.TextBox txtDNI;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TabPage tabAlumno;
        private System.Windows.Forms.DataGridView dgvUsuarios;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.ComboBox comboBox3;
        private System.Windows.Forms.ComboBox comboBox2;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TabControl tabUsers;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn13;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn12;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn11;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn10;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn9;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn8;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn DNI;
        private System.Windows.Forms.DataGridViewTextBoxColumn Nombre;
        private System.Windows.Forms.DataGridViewTextBoxColumn ApPat;
        private System.Windows.Forms.DataGridViewTextBoxColumn ApMat;
        private System.Windows.Forms.DataGridViewTextBoxColumn Direccion;
        private System.Windows.Forms.DataGridViewTextBoxColumn telefono;
        private System.Windows.Forms.DataGridViewTextBoxColumn email;
    }
}