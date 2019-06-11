using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.IO;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistemas_Malvarado
{
    public partial class frmInscribirAlumno_apoderado : Form
    {
        public frmInscribirAlumno_apoderado()
        {
            InitializeComponent();
        }

        private void btnBuscarUsuario_Click(object sender, EventArgs e)
        {

        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnUploadStudyCertificate_Click(object sender, EventArgs e)
        {
            //DialogResult result = ofdStudyCertificate.ShowDialog();
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter = "Files(*.PDF)|*.PDF|All files (*.*)|*.*";
            if (dialog.ShowDialog() == DialogResult.OK)
            {
                String path = dialog.FileName;

                DialogResult result = MessageBox.Show("El certificado de estudios ha sido subido correctamente","Mensaje de validación",MessageBoxButtons.OKCancel); ;
                //using (StreamReader reader = new StreamReader(new FileStream(path, FileMode.Open), new UTF8Encoding()))
                //{
                   //byte[] byteArray = System.IO.File.ReadAllBytes(@"c:\file.pdf");

                //}
                //obtener el nombre del file 
                //string[] f = File.Split('\\');
                //string fn = f[(f.Length) - 1];
                //string dest = @"T:\TA\MalvaradoSoftV2\csharp\Sistemas_Malvarado\Sistemas_Malvarado\archivos\";


            }
        }

        private void btnBirthCertificate_Click(object sender, EventArgs e)
        {
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter = "Files(*.PDF)|*.PDF|All files (*.*)|*.*";
            if (dialog.ShowDialog() == DialogResult.OK)
            {
                String path = dialog.FileName;

                DialogResult result = MessageBox.Show("El certificado de nacimiento ha sido subido correctamente", "Mensaje de validación", MessageBoxButtons.OKCancel); 
                //using (StreamReader reader = new StreamReader(new FileStream(path, FileMode.Open), new UTF8Encoding()))
                //{
                //byte[] byteArray = System.IO.File.ReadAllBytes(@"c:\file.pdf");

                //}
                //obtener el nombre del file 
                //string[] f = File.Split('\\');
                //string fn = f[(f.Length) - 1];
                //string dest = @"T:\TA\MalvaradoSoftV2\csharp\Sistemas_Malvarado\Sistemas_Malvarado\archivos\";


            }
        }

        private void btnHelpCE_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("En esta opción se debe subir el archivo de certificado de estudios, el sistema solo acepta los archivos en formato PDF", "Mensaje de ayuda", MessageBoxButtons.OK);
        }

        private void btnHelpCN_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("En esta opción se debe subir el archivo de certificado de nacimiento, el sistema solo acepta los archivos en formato PDF", "Mensaje de ayuda", MessageBoxButtons.OK);
        }

        private void btnHelpBoleta_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("En esta opción se debe colocar el número del recibo de la boleta de pago para la próxima Matrícula del alumno", "Mensaje de ayuda", MessageBoxButtons.OK);
        }
    }
}
