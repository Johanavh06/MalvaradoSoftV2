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
            Application.Run(new frmInscribirUsuario_secretario());
            //Application.Run(new frmGestionarTipoNota_secretario_());
            //Application.Run(new FormSeccionesACargo());
        }
    }
}
