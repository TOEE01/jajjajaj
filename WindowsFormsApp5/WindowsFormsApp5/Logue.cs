using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp5
{
    public partial class Logue : Form
    {
        public Logue()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string Caja = WindowsFormsApp5.Properties.Settings.Default.Caja;
            string Caja2 = WindowsFormsApp5.Properties.Settings.Default.Caja2;

            string user = textBox3.Text;
            string pass = textBox4.Text;

            if (Caja.Equals(user) && Caja2.Equals(pass)) 
            {
                MessageBox.Show("Bien");
            }
            else
            {
                MessageBox.Show("LA CAGASTE");
            }
        }
    }
}
