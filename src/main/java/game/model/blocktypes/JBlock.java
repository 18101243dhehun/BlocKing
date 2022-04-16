package game.model.blocktypes;

import java.awt.Color;

import game.model.BlockController;

public class JBlock extends BlockController {
    
    @Override
    protected void initModel()
    {
        shape = new int[][] { 
				{1, 1, 1},
				{0, 0, 1}
		};
		color = Color.BLUE;
    }

    public JBlock() {
		shape = new int[][] { 
			{1, 1, 1},
			{0, 0, 1}
		};
		color = Color.BLUE;
	}

}
