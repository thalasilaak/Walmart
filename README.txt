Method for seat assignment:
- assign seats to the theatergoers to be next to each other if they are from the same reservation to stay close to their 
  friends/family
- create a pointer that keeps track of the column and row number to fill next
- fill in the seats starting from the front so the people that reserved seats first will get the closest view of the movie
- After a reservation is done being filled out, write the seat values to the output file and move the pointer showing the next 
  seat to fill in by 3 spaces
- if the reservation ever gets filled and there are less than 4 seats at the end of the row, advance to the next row to stop 
  people in reservations from sitting alone or sitting too close
- if reservation is partially filled and the row ends, then advance to the next row and set the pointer for the column number 
  back to 0
- if the entire theater fills up, then do not fill anymore reservations. 

Assumptions:
- People will want to sit together with at least one fellow member of the reservation group
- It is mandatory to keep at least a 3 seat or 1 row distance between reservation groups for safety reasons
- If a reservation is halfway filled and the theater runs out of seats, customers will prefer to have some members watch the movie
  at the time rather than having none watch the movie so the reservation will be partially filled