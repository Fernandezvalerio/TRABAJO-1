package graphics;

import java.util.Arrays;
import java.util.Iterator;

/**
 * This class represents an image with an array of Strings.
 * You can see an String array as a two dimensional array of chars. 
 *
 */
public class Picture implements Iterable<String>{
	private String[] img;
	private int width = 0;
	public final int length;
	
	/**
	 * It's only allowed create Pictures with static methods.
	 * @param img, Character image.
	 */
	private Picture(String[] img){
		this.img = img;
		length = this.img.length;
		for(String s: img)
			width = Math.max(width, s.length());
	}
	
  /**
   * This must be used to invert the color of an image
   * @param c A character to be inverted (in color way)
   */
	private byte invColor(byte c){
		byte ic;
		switch (c) {
		  case '_': ic = '='; break;
		  case '=': ic = '_'; break;
		  case '.': ic = '@'; break;
		  case '@': ic = '.'; break;
		  default: ic = c; break;
		}
		return ic;
	}
	
  /**
   * used to overlay a the character c2 over the character c1
   * @param c1 the character over
   * @param c2 the character under
   */
	private byte overlay(byte c1, byte c2){
		if(c1 == ' ') return c2;
		return c1;
	}
	
  /**
   * The width of the array, it must be the 
   * most large row
   */
	public int getWidth() {
		return width;
	}

  /**
   * The height of the array, it must be the
   * lenght of the base array
   */
	public int getHeight() {
		return length;
	}

	/**
	 * Vertical Mirror Image 
	 * @return a new Picture, the vertical mirror.
	 */
	public Picture voltearV(){
		String[] img = new String[this.img.length];
		return new Picture(img);
	}
	
	/**
	 * Horizontal Mirror Image
	 * @return a new Picture, the horizontal mirror.
	 */
	public Picture voltearH(){
		String[] img = new String[this.img.length];
		return new Picture(img);
	}
	

	/**
	 * Negative Color
	 * @return a new Picture, the negative color.
	 */
	public Picture invertir(){
		String[] img = new String[this.img.length];
		return new Picture(img);
	}
	
	/**
	 * Put the image p next to the right of the current image.
	 * @param p, the neighbor image
	 * @return a new image
	 */
	public Picture alLado(Picture p){
		String[] img = new String[this.img.length];
		return new Picture(img);
	}
	
	/**
	 * Put the image p next to down of the current image.
	 * @param p, the neighbor image
	 * @return a new image
	 */
	public Picture encima(Picture p){
		String[] img = new String[this.img.length + p.img.length];
		return new Picture(img);
	}
	
	/**
	 * Merge the current picture over the picture p. 
	 * @param p, the picture that will be on the behind.
	 * @return a new picture
	 */
	public Picture superponer(Picture p){
		String[] img = new String[this.img.length];
		return new Picture(img);
	}
	
	/**
	 * Repeat horizontally the current picture n times (to right).
	 * @param n, a positive integer greater than 0.
	 * @return a new picture.
	 */
	public Picture repetirH(int n){
		String[] img = new String[this.img.length];
		return new Picture(img);
	}
	
	/**
	 * Repeat vertically the current picture n times (to down).
	 * @param n, a positive integer greater than 0.
	 * @return a new picture.
	 */
	public Picture repetirV(int n){
		String[] img = new String[this.img.length * n];
		return new Picture(img);
	}
	
	public static Picture casilleroBlanco(){
		String [] img = new String[58];
		for(int i = 0; i < img.length; i++){
			char[] line = new char[58];
			for(int j = 0; j < img.length; j++)
				line[j] = '_';
			img[i] = new String(line);
		}
		return new Picture(img);
	}
	
  /**
   * returns a new Picture object that represents a bishop
   */
	public static Picture alfil(){
		String [] img = {
			      "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                            ##                            ",
				  "                          ######                          ",
				  "                         ###..###                         ",
				  "                         ##....##                         ",
				  "                         ##....##                         ",
				  "                         ###..###                         ",
				  "                          ######                          ",
				  "                           ####                           ",
				  "                         ########                         ",
				  "                        ###....###                        ",
				  "                      ####......####                      ",
				  "                    ####..........####                    ",
				  "                   ###..............###                   ",
				  "                  ###................###                  ",
				  "                 ###..................###                 ",
				  "                ###.........##.........###                ",
				  "                ##..........##..........##                ",
				  "               ###..........##..........###               ",
				  "               ##...........##...........##               ",
				  "               ##.......##########.......##               ",
				  "               ##.......##########.......##               ",
				  "               ##...........##...........##               ",
				  "               ##...........##...........##               ",
				  "               ##...........##...........##               ",
				  "               ###..........##..........###               ",
				  "                ##..........##..........##                ",
				  "                ###....................###                ",
				  "                 ##....................###                ",
				  "                 ###..................###                 ",
				  "                  ###................###                  ",
				  "                   ####################                   ",
				  "                   ####################                   ",
				  "                   ##................##                   ",
				  "                  ###................###                  ",
				  "                  ##..................##                  ",
				  "                  ######################                  ",
				  "                 ########################                 ",
				  "                 ###..................###                 ",
				  "                 #####..............#####                 ",
				  "                 ########################                 ",
				  "                      ##############                      ",
				  "                          ######                          ",
				  "                        ####..####                        ",
				  "        ##################......##################        ",
				  "      ##################..........##################      ",
				  "    ####..........................................####    ",
				  "    ###.....................##.....................###    ",
				  "     ##...................######...................##     ",
				  "     ###.########.......####  ####.......########.###     ",
				  "      ####################      ####################      ",
				  "       ##        #######          #######        ##       ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "				
		};
		return new Picture(img);
	}
	
  /**
   * returns a new Picture object that represents a king
   */
	public static Picture rey(){
		String [] img = {"                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                           ####                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                         ###..###                         ",
				  "                         #......#                         ",
				  "                         ###..###                         ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                          ######                          ",
				  "                         ###..###                         ",
				  "                         ##....##                         ",
				  "                        ###....###                        ",
				  "           #######      ##......##      #######           ",
				  "         ###########    ##......##    ###########         ",
				  "       ####.......####  ##......##  ####.......####       ",
				  "      ###...........######......######...........###      ",
				  "     ###..............####......####..............###     ",
				  "     ##................####....####................##     ",
				  "    ###.................###....###.................###    ",
				  "    ##...................###..###...................##    ",
				  "    ##...................###..###...................##    ",
				  "    ##....................######....................##    ",
				  "    ##....................######....................##    ",
				  "    ##.....................####.....................##    ",
				  "    ###....................####....................###    ",
				  "     ##.....................##....................###     ",
				  "     ###....................##....................##      ",
				  "      ###...................##...................###      ",
				  "       ###..................##..................###       ",
				  "        ###...........##############...........###        ",
				  "         ###.....########################.....###         ",
				  "          ############..............############          ",
				  "           ######........................######           ",
				  "            ##..............................##            ",
				  "            ##..............................##            ",
				  "            ##........##############........##            ",
				  "            ##...########################...##            ",
				  "            ##########..............##########            ",
				  "            #####........................#####            ",
				  "            ##.........############.........##            ",
				  "            ##....######################....##            ",
				  "            ##.########............########.##            ",
				  "            ######......................######            ",
				  "            ######......................######            ",
				  "               ########............########               ",
				  "                  ######################                  ",
				  "                       ############                       ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "
		};
		return new Picture(img);
	}

  /**
   * returns a new Picture object that represents a knight
   */
	public static Picture caballo(){
		String [] img = {"                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "               #         ##                               ",
				  "              ###       ####                              ",
				  "              #####     ####                              ",
				  "               #####   ######                             ",
				  "               ##.### ###..##                             ",
				  "               ##..#####...######                         ",
				  "               ##...####...#########                      ",
				  "               ##..#####...##...######                    ",
				  "              ###.###.......#.....######                  ",
				  "             ###..#.................#####                 ",
				  "            ###.......................####                ",
				  "            ##.........................####               ",
				  "           ###..####....................####              ",
				  "           ##..####......................####             ",
				  "           ##..####......................#####            ",
				  "           ##..###........................####            ",
				  "          ###..#..............##...........####           ",
				  "          ##..................##...........####           ",
				  "          ##..................##............####          ",
				  "         ###..................##............####          ",
				  "         ##...................##.............####         ",
				  "        ###..................###.............####         ",
				  "       ###..................###..............####         ",
				  "      ###...................###...............####        ",
				  "      ##...................####...............####        ",
				  "     ###.................######...............####        ",
				  "     ##................####  ##................####       ",
				  "    ###.##...........####    ##................####       ",
				  "    ##.###.........####     ###................####       ",
				  "    ##.###........###       ##.................####       ",
				  "    ##.##........###       ###.................#####      ",
				  "    ##......##..###        ##...................####      ",
				  "    ##.....###.###        ###...................####      ",
				  "    ###...#######        ###....................####      ",
				  "     ########.##        ###.....................####      ",
				  "       #########       ###......................####      ",
				  "            ###       ###.......................#####     ",
				  "                     ###........................#####     ",
				  "                    ###..........................####     ",
				  "                    ##...........................####     ",
				  "                   ###...........................####     ",
				  "                  ###............................####     ",
				  "                  ##.............................####     ",
				  "                 ###.............................####     ",
				  "                 ##..............................####     ",
				  "                 ##..............................####     ",
				  "                 ####################################     ",
				  "                 ####################################     ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "
		};
		return new Picture(img);
	}

  /**
   * returns a new Picture object that represents a pawn
   */
	public static Picture peon(){
		String [] img = {"                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                           ####                           ",
		                  "                         ########                         ",
		                  "                        ###....###                        ",
		                  "                       ###......###                       ",
		                  "                       ##........##                       ",
		                  "                       ##........##                       ",
		                  "                       ##........##                       ",
		                  "                       ##........##                       ",
		                  "                       ###......###                       ",
		                  "                        ###....###                        ",
		                  "                      #####....#####                      ",
		                  "                     ###..........###                     ",
		                  "                    ###............###                    ",
		                  "                    ##..............##                    ",
		                  "                   ###..............###                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ###..............###                   ",
		                  "                    ##..............##                    ",
		                  "                    ###............###                    ",
		                  "                     ####........####                     ",
		                  "                     ####........####                     ",
		                  "                   ####............####                   ",
		                  "                  ###................###                  ",
		                  "                 ###..................###                 ",
		                  "                ###....................###                ",
		                  "               ###......................###               ",
		                  "               ##........................##               ",
		                  "              ###........................###              ",
		                  "              ##..........................##              ",
		                  "             ###..........................###             ",
		                  "             ##............................##             ",
		                  "             ##............................##             ",
		                  "            ###............................###            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##################################            ",
		                  "            ##################################            ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          "
		};
		return new Picture(img);
	}
	
  /**
   * returns a new Picture object that represents a queen
   */
	public static Picture dama(){
		String [] img = {"                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                            ##                            ",
				  "                          ######                          ",
				  "              #####      ###..###      #####              ",
				  "             #######     ##....##     #######             ",
				  "             ##...##     ##....##     ##...##             ",
				  "             ##...##     ########     ##...##             ",
				  "    ##       ##...##      ######      ##...##       ##    ",
				  "  ######     #######        ##        #######     ######  ",
				  " ###..###     #####        ####        #####     ###..### ",
				  " ##....##       ###        ####        ###       ##....## ",
				  " ###...##       ###        ####        ###       ##...### ",
				  "  #######       ###        ####        ###       #######  ",
				  "   #####        ####      ######      ####        #####   ",
				  "     ###        ####      ##..##      ####        ###     ",
				  "     ####       ####      ##..##      ####       ####     ",
				  "     ####       #####     ##..##     #####       ####     ",
				  "     #####      ##.##     ##..##     ##.##      #####     ",
				  "      #####     ##.##    ###..###    ##.##     #####      ",
				  "      ##.##    ###.###   ##....##   ###.###    ##.##      ",
				  "      ##.###   ##...##   ##....##   ##...##   ###.##      ",
				  "      ##..##   ##...###  ##....##  ###...##   ##..##      ",
				  "      ##..###  ##....## ###....### ##....##  ###..##      ",
				  "      ###..##  ##....## ##......## ##....##  ##..###      ",
				  "       ##..### ##....#####......#####....## ###..##       ",
				  "       ##...#####.....####......####.....#####...##       ",
				  "       ##....####.....####......####.....####....##       ",
				  "       ##....####..#..###..####..###..#..####....##       ",
				  "       ###....###.######################.###....###       ",
				  "        ##.################....################.##        ",
				  "        ##########......................##########        ",
				  "        ###....................................###        ",
				  "         ##....................................##         ",
				  "         ###..................................###         ",
				  "          ###.......##################.......###          ",
				  "           ####################################           ",
				  "            ########..................########            ",
				  "            ###............................###            ",
				  "             ##............................##             ",
				  "             ##......################......##             ",
				  "             ################################             ",
				  "             ########................########             ",
				  "             ##............................##             ",
				  "            ###.....##################.....###            ",
				  "            ##################################            ",
				  "           #########..................#########           ",
				  "           ##................................##           ",
				  "           ##................................##           ",
				  "           #########..................#########           ",
				  "             ################################             ",
				  "                    ##################                    ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "
		};
		return new Picture(img);
	}

  /**
   * returns a new Picture object that represents a rook
   */
	public static Picture torre(){
		String [] img = {"                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "           #########     ########     #########           ",
		                  "           #########     ########     #########           ",
		                  "           ##.....##     ##....##     ##.....##           ",
		                  "           ##.....##     ##....##     ##.....##           ",
		                  "           ##.....#########....#########.....##           ",
		                  "           ##.....#########....#########.....##           ",
		                  "           ##................................##           ",
		                  "           ####################################           ",
		                  "           ####################################           ",
		                  "            ###............................###            ",
		                  "             ####........................####             ",
		                  "               ############################               ",
		                  "                ##########################                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##########################                ",
		                  "               ############################               ",
		                  "              ###........................###              ",
		                  "            ##################################            ",
		                  "            ##################################            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "        ##########################################        ",
		                  "        ##########################################        ",
		                  "        ##......................................##        ",
		                  "        ##########################################        ",
		                  "        ##########################################        ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          "
		};
		return new Picture(img);
	}

  /**
   * Returns an iterator over the pixels in the image. The iteration is over columns and rows.
   */
	private class PIterator implements Iterator<String>{
		private int index = 0;
		@Override
		public boolean hasNext() {
			return index < img.length;
		}

		@Override
		public String next() {
			assert index < img.length: "index="+index+"\timg.length="+img.length;
			String s = img[index];
			index++;
			return s;
		}

		@Override
		public void remove() {
      throw new UnsupportedOperationException("Not modification allowed");
		}
		
	}
	@Override
	public Iterator<String> iterator() {
		return new PIterator();
	}
	

}
