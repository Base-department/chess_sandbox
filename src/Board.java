public class Board{
    class Cage{
        private Figure figure;
        Cage(Figure figure){
            this.figure = figure;
        }
        Cage(){}
        public void setFigure(Figure figure){
            this.figure = figure;
        }
        public Figure getFigure(){
            return this.figure;
        }
    }
    Cage[][] field = new Cage[8][8];
}
