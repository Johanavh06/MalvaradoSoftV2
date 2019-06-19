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
    public partial class frmRegistrarNotas : Form
    {
        private MAlvaradoWS.user professor;
        private MAlvaradoWS.courseSchedule courseScheduleSelected;
        private BindingList <MAlvaradoWS.courseSchedule> courseSchedules;
        private BindingList<MAlvaradoWS.course> courses;

        private frmFeedback feed;

        public frmRegistrarNotas(MAlvaradoWS.user p)
        {
            courseSchedules = new BindingList<MAlvaradoWS.courseSchedule>();
            courses = new BindingList<MAlvaradoWS.course>();
            professor = p;
            InitializeComponent();
        }

        private void ingresarFeedback(object sender, DataGridViewCellEventArgs e)
        {
            feed = new frmFeedback();
            feed.ShowDialog();
        }
    }
}
