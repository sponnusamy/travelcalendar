# travelcalendar

-  Travel details for given date/month/week for a contact
- Extract travel details from SMS
- Upadate travel details if cancelled
- Count No of friends travelling for date/month/week for a contact for same destination
- List Friends travelling for a day for same destination
- Is contact travelling today ? Align with first point


Settings
- Announce my travel to friends
- Enable/disable notifcations


Contact Service
	- CRUD
TravelService
	- CREAE (From SMS)
	- READ
	- UPDATE (For Cancel Mostly)
	- ByContactId(By Given from and to date, Default current Month)
	- GetFriendsTravelByContactId(by from and to date and destination)
	- CountFrinedsTravelByContactId(by from and to date and destination))

PreferenceService
	- CRU


Travel
	- Id
	- travel_mode (enum)
	- status (enum)
	- travels_name
	- travelDate
	- Departure_time
	- ticketId
	- NoPassengers
	- From
	- To
	- AuditFields


Travel_Contact_Assoc
	- travel_id
	- contact_id


