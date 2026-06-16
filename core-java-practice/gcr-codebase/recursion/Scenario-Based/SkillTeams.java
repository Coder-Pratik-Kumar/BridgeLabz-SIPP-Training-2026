import java.util.ArrayList;
import java.util.List;

public class SkillTeams {
    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;
        List<List<Integer>> teams = new ArrayList<>();
        findTeams(skills, target, 0, new ArrayList<>(), teams);
        for (List<Integer> team : teams) {
            System.out.println(team);
        }
    }

    public static void findTeams(int[] skills, int target, int index,
                                 List<Integer> current, List<List<Integer>> teams) {
        if (target == 0) {
            teams.add(new ArrayList<>(current));
            return;
        }
        if (index == skills.length || target < 0) {
            return;
        }
        // include current skill
        current.add(skills[index]);
        findTeams(skills, target - skills[index], index + 1, current, teams);
        current.remove(current.size() - 1);
        // exclude current skill
        findTeams(skills, target, index + 1, current, teams);
    }
}
