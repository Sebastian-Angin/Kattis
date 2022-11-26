using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Volim
{
    public class TimeAndAwser
    {
        private int time;
        private string anwser;

        public TimeAndAwser(string _time, string _anwser)
        {
            this.time = Int32.Parse(_time);
            this.anwser = _anwser;
        }
        
        public int Time
        {
            get { return time;  }
            set { time = value; }
        }

         public string Anwser
        {
            get { return anwser;  }
            set { anwser = value; }
        }
    }
}