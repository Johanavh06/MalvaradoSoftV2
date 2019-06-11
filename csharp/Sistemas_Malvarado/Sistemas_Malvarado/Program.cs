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
<<<<<<< HEAD
            //Application.Run(new frmInscribirAlumno_apoderado());
            Application.Run(new frmInscribirUsuario_secretario());
            //Application.Run(new frmGestionarTipoNota_secretario_());
=======
            //Application.Run(new FormInscribirUsuario());
<<<<<<< HEAD
            Application.Run(new frmGestionarAsistencia());
=======
<<<<<<< HEAD
            Application.Run(new frmLogin());
=======
            Application.Run(new frmListarAlumnos());
>>>>>>> bc45394686b48398d05bb848985ed87d85f02753
>>>>>>> e07ae3ad22cd6f7a229869a740b6ebc8fa7c85fb
>>>>>>> cc85d15c29a88cc43768e3a6ab7960c2834858dc
            //Application.Run(new FormSeccionesACargo());
        }
    }
}
