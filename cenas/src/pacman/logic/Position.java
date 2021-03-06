package pacman.logic;

import java.io.Serializable;

import pacman.GUI.GameEngine;


/**  
* Position.java - a simple class to create a coordinate that represents a location in (x,y) point in space,  specified in
* integer precision.
*/

public class Position implements Serializable
{
	private static final long serialVersionUID = 1L;

/**
 * Override of equals - tests if two positions are equal
 * @return <code>true</code> true if positions are equal
 */
	@Override
	public boolean equals(Object o) 
	{
		return (o != null) && (o instanceof Position) && ((Position)o).x / GameEngine.TILE_DIMENSION == x / GameEngine.TILE_DIMENSION && ((Position)o).y / GameEngine.TILE_DIMENSION == y / GameEngine.TILE_DIMENSION;
	}

	/**
	 * The X coordinate of this coord.
	 */
	public int x;
	
	/**
	 * The Y coordinate of this coord.
	 */
	public int y;
	
	
	/**
	 * Constructs and initializes a coord at the specified (x,y) location in the
	 * coordinate space.
	 * 
	 * @param first
	 *            the X coordinate of the newly constructed Position.
	 * @param second
	 *            the Y coordinate of the newly constructed Position.
	 */
	public Position (int first, int second) 
	{ 
		this.x = first;
		this.y = second;
	}


	
}
