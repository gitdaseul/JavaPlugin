package daseul.com;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("플러그인이 켜졌습니다!");
    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인이 꺼졌습니다!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(label.equalsIgnoreCase("test1")) {
            player.sendMessage(ChatColor.GREEN + "[Test1] " + ChatColor.WHITE + "명령어가 실행되었습니다!");
        }
        Player player1 = (Player) sender;
        if(label.equalsIgnoreCase("left")) {
            player1.kickPlayer(ChatColor.RED + "left " + ChatColor.WHITE + "명령어를 사용하셔서 서버에서 " + ChatColor.RED + "강제 퇴장 되었습니다!");
        }
        Player player2 = (Player) sender;
        if(label.equalsIgnoreCase("exp")){
            player2.giveExpLevels(10);
            player2.sendMessage(ChatColor.GREEN + "경험치 [10] " + ChatColor.WHITE + "이 주어졌습니다");
        }
        Player player3 = (Player) sender;
        if(label.equalsIgnoreCase("ts")){
            if(args.length == 1){
                World world = player3.getWorld();
                if(args[0].equalsIgnoreCase("dy")){
                    world.setTime(1000);
                    player3.sendMessage(ChatColor.WHITE + "시간을 " + ChatColor.GREEN + "[Day(1000)]" + ChatColor.WHITE + " 으로 설정했습니다");
                } else if(args[0].equalsIgnoreCase("no")){
                    world.setTime(6000);
                    player3.sendMessage(ChatColor.WHITE + "시간을 " + ChatColor.GREEN + "[Noon(6000)]" + ChatColor.WHITE + " 으로 설정했습니다");
                } else if(args[0].equalsIgnoreCase("ni")){
                    world.setTime(13000);
                    player3.sendMessage(ChatColor.WHITE + "시간을 " + ChatColor.GREEN + "[Night(13000)]" + ChatColor.WHITE + " 으로 설정했습니다");
                } else if(args[0].equalsIgnoreCase("mi")){
                    world.setTime(18000);
                    player3.sendMessage(ChatColor.WHITE + "시간을 " + ChatColor.GREEN + "[MidNight(13000)]" + ChatColor.WHITE + " 으로 설정했습니다");
                } else {
                    player3.sendMessage(ChatColor.RED + "정확한 명령어를 입력해주세요! (dy | no | ni | mi)");
                }
            }
        }
        Player player4 = (Player) sender;
        if(label.equalsIgnoreCase("user")){
            player3.sendMessage(player4.getName() + "님이 " + ChatColor.GREEN + "[user]" + ChatColor.WHITE + " 명령어를 사용하셨습니다!");
        }
        return true;
    }
}
