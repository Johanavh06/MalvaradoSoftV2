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

<<<<<<< HEAD
            //MAlvaradoWS.course curso = new MAlvaradoWS.course();
            //curso.id = 1;
            //curso.name = "Test";
            //Application.Run(new frmGestionarTipoNota_secretario_(curso));
=======

            //Prueba Gestionar Tipo Nota
            MAlvaradoWS.course curso = new MAlvaradoWS.course();
            curso.id = 1;
            curso.name = "Test";
            Application.Run(new frmGestionarTipoNota_secretario_(curso));
            
>>>>>>> 3ce7557002c846a245b6699e3b44bc131f90650f

            Application.Run(new frmInscribirUsuario_secretario_());
            //Application.Run(new frmMenuInscribirAlumno_Apoderado());
            //Application.Run(new FormSeccionesACargo());
        }
    }
}
