fork then add new feature

* new option "dh_mode_central". it is true by default. it is same behavior as before, meaning only deploy onto admin server, remotely collect statistics from all running server instances. when set it false, it collect statistics only against local server. it does no longer rely on remote connection through listen port. it looks more efficient.
* make it works with wls 12.2.1.3. including the webapp