package globals;

import java.util.ArrayList;

public class Variables {
	/*
	 * Holds all the global variables
	 */
	public static String currentURI; //URI currently being searched
	public static String currentWebPage; //Webpage html content currently being searched
	
	public static ArrayList<String> lastSearch = new ArrayList<String>(); //contains a list of all links queried
	public static ArrayList<String> cache = new ArrayList<String>(); //holds the dataCache generated by a search
	
	public static String magnetLink; //Most recent magnetLink
	public static String torrentPreview; //Preview of content of most recent .torrent file
	
	public static String downloadUri; //URI location of most recent torrent download
	public static String downloadName; //Name of File and download location.
	
	public static String query; //Most recent search query
	public static String mediaType; //Movie/Music/TV/Other (movie and music are currently the only available fields)
	public static boolean qualityCheck; //Safe-search enabled
	
	//Not converted raw strings
	public static String seedCount; //Number of seeds of the most recently searched torrent as a String
	public static String leechCount; //Number of leeches for the most recently searched torrent a String
	public static String sizeCount; //Size of the most recently searched torrent as a float
	
	//Movie Size
	public static float musicSizeMin = 3; //The minimum size (in megabytes) of the music torrent that can be downloaded
	public static float musicSizeMax = 10; //The maximum size (in megabytes) of the music torrent that can be downloaded
	public static float albumSizeMin = 30;  //The minimum size (in megabytes) of the album torrent that can be downloaded
	public static float albumSizeMax = 300; //The minimum size (in megabytes) of the album torrent that can be downloaded
	public static float movieSizeMin = 2000; //The minimum size (in megabytes) of the movie torrent that can be downloaded
	public static float movieSizeMax = 10000; //The maximum size (in megabytes) of the movie torrent that can be downloaded


	
	
	
}
