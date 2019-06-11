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
            //Application.Run(new frmInscribirAlumno_apoderado());
            Application.Run(new frmMenuInscribirAlumno_Apoderado());
            //Application.Run(new frmGestionarTipoNota_secretario_());

            //Application.Run(new FormInscribirUsuario());
            //Application.Run(new FormSeccionesACargo());
        }
    }
}
