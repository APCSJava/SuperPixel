/***
 * Provides practice working with 2D arrays of objects (SuperPixels)
 *
 */
public class Colorizer {

	/**
	 * Produces an array having the same dimensions as the original but with all
	 * superpixels colored red (java.awt.Color.RED).
	 * 
	 * The returned array will be held in a buffer until loaded by pressing the
	 * SPACE bar. The original array should not be modified -- i.e. the picture on
	 * the screen should not change until the SPACE key is pressed.
	 * 
	 * @param original
	 *            a superpixel array that should not be altered
	 * @return a new array with the properties described
	 */
	public SuperPixel[][] commandRed(SuperPixel[][] original) {
		SuperPixel[][] mod = new SuperPixel[original.length][original[0].length];
		for (int r = 0; r < mod.length; r++) {
			for (int c = 0; c < mod[r].length; c++) {
				mod[r][c] = new SuperPixel(java.awt.Color.RED);
			}
		}
		return mod;
	}

	/**
	 * Produce an array of the same dimensions as the original having every other
	 * column colored green.
	 * 
	 * The returned array will be held in a buffer until loaded by pressing the
	 * SPACE bar. The original array should not be modified -- i.e. the picture on
	 * the screen should not change until the SPACE key is pressed.
	 * 
	 * @param original
	 *            a superpixel array that should not be altered
	 * @return a new array with the properties described
	 */
	SuperPixel[][] commandGreen(SuperPixel[][] original) {
		// TODO implement this method
		return null;
	}

	/**
	 * Produce an array of the same dimensions as the original having every third
	 * row colored blue. The returned array will be held in a buffer until loaded by
	 * pressing the SPACE bar.
	 * 
	 * The original array should not be modified -- i.e. the picture on the screen
	 * should not change until the SPACE key is pressed.
	 * 
	 * @param original
	 *            a superpixel array that should not be altered
	 * @return a new array with the properties described
	 */
	SuperPixel[][] commandBlue(SuperPixel[][] original) {
		// TODO implement this method
		return null;
	}

	/**
	 * Produce an array of the same dimensions as the original but each superpixel
	 * has a 50% probability of turning white.
	 * 
	 * The returned array will be held in a buffer until loaded by pressing the
	 * SPACE bar. The original array should not be modified -- i.e. the picture on
	 * the screen should not change until the SPACE key is pressed.
	 * 
	 * @param original
	 *            a superpixel array that should not be altered
	 * @return a new array with the properties described
	 */
	SuperPixel[][] commandWhite(SuperPixel[][] original) {
		SuperPixel[][] mod = new SuperPixel[original.length][original[0].length];
		for (int r = 0; r < mod.length; r++) {
			for (int c = 0; c < mod[r].length; c++) {
				mod[r][c] = Math.random() > 0.5 ? new SuperPixel(java.awt.Color.WHITE)
						: new SuperPixel(original[r][c].getColor());
			}
		}
		return mod;
	}

	/**
	 * Modifies the original array by setting the color of all elements to black
	 * (java.awt.Color.BLACK).
	 * 
	 * @param original
	 *            a superpixel array to mutate
	 */
	void commandClear(SuperPixel[][] original) {
		// TODO implement this method
	}

	/**
	 * Shifts all super pixels up one row. As the bottom row moves up, it is
	 * replaced with a row of all black pixels (ie. edges do not wrap when scrolling
	 * up).
	 * 
	 * @param original
	 *            a superpixel array to mutate
	 */
	void commandUp(SuperPixel[][] original) {
		// TODO implement this method
	}

	/**
	 * Shifts all super pixels down one row. As the bottom row moves down, its
	 * pixels reappear at the top (ie. edges wrap when scrolling down).
	 * 
	 * @param original
	 *            a superpixel array to mutate
	 */
	void commandDown(SuperPixel[][] original) {
		// TODO implement this method
	}

	/**
	 * Shifts all super pixels left one column. As the leftmost pixels scroll off
	 * the screen they are replaced with black super pixels in the rightmost column
	 * (ie. edges do not wrap when scrolling left)
	 * 
	 * @param original
	 *            a superpixel array to mutate
	 */
	void commandLeft(SuperPixel[][] original) {
		for (int r = 0; r < original.length; r++) {
			for (int c = 0; c < original[0].length; c++) {
				if (c == original[0].length - 1) {
					original[r][c] = new SuperPixel(java.awt.Color.BLACK);
				} else {
					original[r][c] = original[r][c + 1];
				}
			}
		}
	}

	/**
	 * Shifts all super pixels right one column. As the rightmost pixels scroll off
	 * the screen they reappear at the left edge (ie. edges wrap when scrolling
	 * right)
	 * 
	 * @param original
	 *            a superpixel array to mutate
	 */
	void commandRight(SuperPixel[][] original) {
		// TODO implement this method
	}

	/**
	 * Sets the color property of the parameter to white.
	 * 
	 * @param thisPixel
	 *            a single superpixel to mutate
	 */
	public static void modifySuperPixel(SuperPixel thisPixel) {
		thisPixel.setColor(java.awt.Color.WHITE);
	}

	/**
	 * Modifies the given array according to John Conway's rules for the Game of
	 * Life. Examine each cell in the current generation and determine its state in
	 * the subsequent generation based on the state of surrounding cells.
	 * 
	 * @param original
	 *            a superpixel array to mutate
	 */
	public void lifeCommand(SuperPixel[][] original) {
		// TODO implement this method
	}

}