using Sistemas_Malvarado.MenuPrincipal;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistemas_Malvarado
{
    static class Program
    {
        /// <summary>
        /// Punto de entrada principal para la aplicación.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            //Application.Run(new frmLogin());

            //MAlvaradoWS.course curso = new MAlvaradoWS.course();
            //curso.id = 1;
            //curso.name = "Test";
            //Application.Run(new frmGestionarTipoNota_secretario_(curso));
            

            Application.Run(new frmMenuInscribirAlumno_Apoderado());
            //Application.Run(new FormSeccionesACargo());
        }
    }
}
