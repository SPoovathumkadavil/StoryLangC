using nam;
using component;

run main,
  /* When Will It End */
  boolean isDone = typewrite("AA", 100);
  /* Waits until complete ? */
  when isDone,
    typewrite("Yeah, Its Done");
    write(pythag(2, 3) as string)
  !
!
