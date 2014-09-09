public class PartC
{
  /*
   * Ushahidi Classes and methods:
   * 
   * Class: UshahidiReport
   * 
   * Fields: reportTitle, reportDescription, categories, priority, respondTime,
   *    firstName, lastName, email, locationName, newsSourceLink, externalVideoLink, 
   *    location
   *    
   * Constructor: UshahidiReport(**All fields above**)
   * 
   * Methods: submitReport(), getReportSummary(), change**any field**(New value)
   * 
   * Description: This class contains data fields for all data involved in a Ushahidi report.
   *    the constructor would set all fields with the inputs from the website text fields. 
   *    The submitReport function would let a user submit a report. The getReportSummary
   *    function gives any user a small summary of the report. The change**any field** function
   *    would allow users to update any field to the preferred value and correct errors. 
   *
   * 
   * Class: UshahidiMap
   * 
   * Fields: longitude, latitude, nameOfLocation, Image map, UshahidiReport[] reports
   * Constructor: UshahidiMap(longitude, latitude, reports, map)
   *              UshahidiMap(nameOfLocation, reports, map)
   *              
   * Methods addReport(UshahidiReport), viewReportsLocation(), changeMap(Map), showReportBlurb(report)
   * 
   * Description: This class contains all information needed to make a Ushahidi map. The first constructor
   *    makes a new Ushahidi map centered at the given longitude and latitude, stores the report at the location, and 
   *    puts markers for the location of the report on the image of the map. The second constructor does the same
   *    but takes the name of the location, finds it's position on the map and sets the report to the location with the 
   *    necessary marker.
   *            addReport(UshahidiReport) adds a new report to the location specified on the map.
   *            viewReportsLocation() centers the view on the location with most reports.
   *            changeMap(Map) changes the map file to the desired map
   *            showReportBlurb() shows the blurb of the report when the mouse hovers over the marker.
   *   
   *    
   *    
   *  
   *     
   * 
   * 
   * 
   * 
   */
}
