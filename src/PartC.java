public class PartC
{
  /*
   * Ushahidi Classes and methods:
   * 
   * Class: UshahidiReport
   * 
   * Fields: String reportTitle,  String reportDescription, boolean[] categories, 
   *    int priority, UshahidiTime respondTime, String firstName, String lastName, 
   *    String email, String locationName, String newsSourceLink, String externalVideoLink, 
   *    UshahidiLocation location
   *    
   * Constructor: UshahidiReport(**All fields above**)
   * 
   * Methods: void submitReport(), String getReportSummary(), void change**any field**(value),
   *    void get**any field**()
   * 
   * Description: This class contains data fields for all data involved in a Ushahidi report.
   *    Most fields are self-explanatory, but categories is boolean array corresponding to
   *    each of the categories and priority is an integer on the priority scale. 
   *    
   *    The constructor would set all fields with the inputs from the website text fields. 
   *    
   *    submitReport() function would let a user submit a report. 
   *    getReportSummary() would return a string that contained several fields ammended together 
   *        to gives any user a small summary of the report. 
   *    change**any field**(value) function would allow the user to set any field with value
   *        and would allow users to update any field and correct errors. 
   *    get**any field**() would return the value of the field
   *
   * 
   * 
   * Class: UshahidiMap
   * 
   * Fields: UshahidiLocation location, UshahidiReport[] reports
   * 
   * Constructors: UshahidiMap(location, reports)
   *              
   * Methods: void addReport(UshahidiReport), void viewReportsLocation(), String showReportBlurb(report)
   * 
   * Description: This class contains all information needed to make a Ushahidi map. The first constructor
   *    makes a new Ushahidi map centered at the given longitude and latitude, stores the report at the location, and 
   *    puts markers for the location of the report on the image of the map. The second constructor does the same
   *    but takes the name of the location, finds it's position on the map and sets the report to the location with the 
   *    necessary marker.
   *
   *    addReport(UshahidiReport) adds a new report to the location specified on the map.
   *    viewReportsLocation() centers the view on the location with most reports.
   *    showReportBlurb() shows the blurb of the report when the mouse hovers over the marker.
   *   
   *  
   *
   * Class: UshahidiLocation
   *    
   * Fields: double longitude, double latitude, String locationName
   *     
   * Constructors: UshahidiLoaction(longitude, latitude)
   *               UshahidiLocation(LocationName)
   * 
   * Methods: void fetchLocationName()
   *
   * Description: This class contains the longitude and latitude information for a location in a Ushahidi
   *    If necessary , it fetches the locations name from a database. The first constructor initializes 
   *    a location with a longitude and latitude value. The second takes a location name and parses a database
   *    to find the appropriate latitude and longitude. 
   *
   *    fetchLocationName() takes a location intialized with latitude and longitude values and fetches the name
   *        from the database.
   *
   *
   *
   * Class: UshahidiTime
   *
   * Fields: int day, int month, int year, int hour, int minute, int second
   * 
   * Constructor: UshahidiTime()
   *              UshahidiTime(String timeString)
   *
   * Methods: String toString()
   *
   * Description: This class contains the fields that will create a new time for Ushahidi reports. The first
   *    Constructor fetches the current time from the system time, and the second initializes with a string that
   *    contains all fields necessary for the report.
   *
   *    toString() converts the fields into a properly made String.
   */
}
