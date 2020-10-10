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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            textBox1.Text = WindowsFormsApp5.Properties.Settings.Default.Caja;
            textBox2.Text = WindowsFormsApp5.Properties.Settings.Default.Caja2;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            WindowsFormsApp5.Properties.Settings.Default.Caja = textBox1.Text;
            WindowsFormsApp5.Properties.Settings.Default.Caja2 = textBox2.Text;
            WindowsFormsApp5.Properties.Settings.Default.Save();

            Logue loge = new Logue();
            this.Visible = false;
            loge.Visible = true;
        }
    }

}
