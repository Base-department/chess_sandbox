import javax.lang.model.type.NullType;

abstract class Abstract_Match {
    Board board;
    String player_state_one;
    String player_state_two;
    String game_state;
    Match_Preset match_preset;
    int first_player_timer;
    int second_player_timer;

    private void check_for_check() {
        //...
    }
    private void check_for_mate() {
        //...
    }
    private void check_for_stalemate() {
        //...
    }
    private void check_for_draw() {
        //...
    }
    private boolean add_figure(Coordinates coordinates, Figure figure){
        if (board.field[coordinates.first][coordinates.second] == null){
            return false;
        }
        board.field[coordinates.first][coordinates.second].setFigure(figure);
        return true;
    }
    private boolean check_move(Coordinates start, Coordinates finish){
        //...
        return true;
    }
    private boolean move(Coordinates start, Coordinates finish){
        if (!check_move(start,finish)){
            return false;
        }
        //...
        return true;
    }

}
