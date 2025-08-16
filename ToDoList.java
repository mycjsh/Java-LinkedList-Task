public class ToDoList 
{
    private TaskNode cList;
   public void addTask(String title) 
   {
        TaskNode mTask = new TaskNode(title);
        if (cList == null) {
            cList = mTask;
        } else {
            TaskNode tCurrrent = cList;
            while (tCurrrent.sNext != null) {
                tCurrrent = tCurrrent.sNext;
            }
            tCurrrent.sNext = mTask;
        }
        System.out.println("Task added!");
    }

    public void deleteTask(String title) {
        if (cList == null) {
            System.out.println("List is empty.");
            return;
        }
        if (cList.sTitle.equals(title)) {
            cList = cList.sNext;
            System.out.println("Task deleted!");
            return;
        }
        TaskNode sCurrrent = cList;
        while (sCurrrent.sNext != null && !sCurrrent.sNext.sTitle.equals(title)) {
            sCurrrent = sCurrrent.sNext;
        }
        if (sCurrrent.sNext == null) {
            System.out.println("Task not found.");
        } else {
            sCurrrent.sNext = sCurrrent.sNext.sNext;
            System.out.println("Task deleted!");
        }
    }

    public void printTasks() {
        if (cList == null) {
            System.out.println("No tasks.");
        } else {
            System.out.println("Your tasks:");
            TaskNode sTask = cList;
            while (sTask != null) {
                System.out.println("- " + sTask.sTitle);
                sTask = sTask.sNext;
            }
        }
    }

    public boolean contains(String title) {
        TaskNode bContains = cList;
        while (bContains != null) {
            if (bContains.sTitle.equals(title)) {
                return true;
            }
            bContains = bContains.sNext;
        }
        return false;
    }
}


