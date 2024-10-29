
Check wget:
wget --version
could be located: usr/bin/wget

if not, install wget:
wget https://git.io/vpn -O openvpn-install.sh

if sudo command is not installed
apt install sudo

INSTALLATION:

1. Copy the "public key" of Elastic repo:
   sudo wget -qO - https://artifacts.elastic.co/GPG-KEY-elasticsearch | sudo apt-key add -

!->	If gnupg, gnupg2 and gnupg1 do not seem to be installed, but one of them is required for this operation
{
apt-get update && apt-get install -y gnupg
}

2. Add Elastic's repo to system:
   echo "deb https://artifacts.elastic.co/packages/8.x/apt stable main" | tee -a /etc/apt/sources.list.d/elastic-8.x.list

check if it appears in /etc/apt/sources.list.d (elastic-8.x.list)

3. Install Elastisearch:
   apt update && apt install Elasticsearch

!!! Copy the info from console after installation

Example:
-------------------------------------------------------------------------------- 
Authentication and authorization are enabled.
TLS for the transport and HTTP layers is enabled and configured.

The generated password for the elastic built-in superuser is : abc12345

If this node should join an existing cluster, you can reconfigure this with
'/usr/share/elasticsearch/bin/elasticsearch-reconfigure-node --enrollment-token                   <token-here>'
after creating an enrollment token on your existing cluster.

You can complete the following actions at any time:

Reset the password of the elastic built-in superuser with
'/usr/share/elasticsearch/bin/elasticsearch-reset-password -u elastic'.

Generate an enrollment token for Kibana instances with
'/usr/share/elasticsearch/bin/elasticsearch-create-enrollment-token -s kibana'.

Generate an enrollment token for Elasticsearch nodes with
'/usr/share/elasticsearch/bin/elasticsearch-create-enrollment-token -s node'.

-------------------------------------------------------------------------------- 

Check status:
systemctl status elasticsearch.service

Add Elastisearch to autorun:
systemctl daemon-reload
systemctl enable elasticsearch.service
Should be if normal:
"Created symlink /etc/systemd/system/multi-user.target.wants/elasticsearch.service → /lib/systemd/system/elasticsearch.service"

Start Elasticsearch:
systemctl start elasticsearch.service


Check working:
curl -k -u elastic:abc12345 https://localhost:9200/

Where:
abc12345 - Elastic password from the previously mentioned info you copied from console.

@LevGoryachev

