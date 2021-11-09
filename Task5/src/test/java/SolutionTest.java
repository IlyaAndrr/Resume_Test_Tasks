import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Условие: Получить значение из json: 262517
//На входе: Массив объектов Json и Id
class SolutionTest {

    @Test
    void main() throws Exception {
        //Путь до файла
        String file="";
        //Искомый айди
        String id="";
        String[] args = {file, id};
        Solution.main(args);
    }

//Поиск объекта по айди в массиве объектов, для теста выбран первый айди
    @Test
    void jsonById() throws Exception {
        Assertions.assertEquals(Solution.jsonById(s, "6104546"),"{\"stargazers_count\":0,\"pushed_at\":\"2012-10-06T16:37:39Z\",\"subscription_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/subscription\",\"language\":null,\"branches_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/branches{/branch}\",\"issue_comment_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/issues/comments{/number}\",\"labels_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/labels{/name}\",\"subscribers_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/subscribers\",\"releases_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/releases{/id}\",\"svn_url\":\"https://github.com/mralexgray/-REPONAME\",\"id\":6104546,\"forks\":0,\"archive_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/{archive_format}{/ref}\",\"git_refs_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/git/refs{/sha}\",\"forks_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/forks\",\"statuses_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/statuses/{sha}\",\"ssh_url\":\"git@github.com:mralexgray/-REPONAME.git\",\"license\":null,\"full_name\":\"mralexgray/-REPONAME\",\"size\":48,\"languages_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/languages\",\"html_url\":\"https://github.com/mralexgray/-REPONAME\",\"collaborators_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/collaborators{/collaborator}\",\"clone_url\":\"https://github.com/mralexgray/-REPONAME.git\",\"name\":\"-REPONAME\",\"pulls_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/pulls{/number}\",\"default_branch\":\"master\",\"hooks_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/hooks\",\"trees_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/git/trees{/sha}\",\"tags_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/tags\",\"private\":false,\"contributors_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/contributors\",\"has_downloads\":true,\"notifications_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/notifications{?since,all,participating}\",\"open_issues_count\":0,\"description\":null,\"created_at\":\"2012-10-06T16:37:39Z\",\"watchers\":0,\"keys_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/keys{/key_id}\",\"deployments_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/deployments\",\"has_projects\":true,\"archived\":false,\"has_wiki\":true,\"updated_at\":\"2013-01-12T13:39:30Z\",\"comments_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/comments{/number}\",\"stargazers_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/stargazers\",\"disabled\":false,\"git_url\":\"git://github.com/mralexgray/-REPONAME.git\",\"has_pages\":false,\"owner\":{\"gists_url\":\"https://api.github.com/users/mralexgray/gists{/gist_id}\",\"repos_url\":\"https://api.github.com/users/mralexgray/repos\",\"following_url\":\"https://api.github.com/users/mralexgray/following{/other_user}\",\"starred_url\":\"https://api.github.com/users/mralexgray/starred{/owner}{/repo}\",\"login\":\"mralexgray\",\"followers_url\":\"https://api.github.com/users/mralexgray/followers\",\"type\":\"User\",\"url\":\"https://api.github.com/users/mralexgray\",\"subscriptions_url\":\"https://api.github.com/users/mralexgray/subscriptions\",\"received_events_url\":\"https://api.github.com/users/mralexgray/received_events\",\"avatar_url\":\"https://avatars3.githubusercontent.com/u/262517?v=4\",\"events_url\":\"https://api.github.com/users/mralexgray/events{/privacy}\",\"html_url\":\"https://github.com/mralexgray\",\"site_admin\":false,\"id\":262517,\"gravatar_id\":\"\",\"node_id\":\"MDQ6VXNlcjI2MjUxNw==\",\"organizations_url\":\"https://api.github.com/users/mralexgray/orgs\"},\"commits_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/commits{/sha}\",\"compare_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/compare/{base}...{head}\",\"git_commits_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/git/commits{/sha}\",\"blobs_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/git/tags{/sha}\",\"merges_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/merges\",\"downloads_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/downloads\",\"has_issues\":true,\"url\":\"https://api.github.com/repos/mralexgray/-REPONAME\",\"contents_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/contents/{+path}\",\"mirror_url\":null,\"milestones_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/milestones{/number}\",\"teams_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/teams\",\"fork\":false,\"issues_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/issues{/number}\",\"events_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/events\",\"issue_events_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/issues/events{/number}\",\"assignees_url\":\"https://api.github.com/repos/mralexgray/-REPONAME/assignees{/user}\",\"open_issues\":0,\"watchers_count\":0,\"node_id\":\"MDEwOlJlcG9zaXRvcnk2MTA0NTQ2\",\"homepage\":null,\"forks_count\":0}" );
    }


//Первые и последние 2 объекта и файла в строке
    String s="[\n" +
            "  {\n" +
            "    \"id\": 6104546,\n" +
            "    \"node_id\": \"MDEwOlJlcG9zaXRvcnk2MTA0NTQ2\",\n" +
            "    \"name\": \"-REPONAME\",\n" +
            "    \"full_name\": \"mralexgray/-REPONAME\",\n" +
            "    \"private\": false,\n" +
            "    \"owner\": {\n" +
            "      \"login\": \"mralexgray\",\n" +
            "      \"id\": 262517,\n" +
            "      \"node_id\": \"MDQ6VXNlcjI2MjUxNw==\",\n" +
            "      \"avatar_url\": \"https://avatars3.githubusercontent.com/u/262517?v=4\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/mralexgray\",\n" +
            "      \"html_url\": \"https://github.com/mralexgray\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/mralexgray/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/mralexgray/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/mralexgray/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/mralexgray/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/mralexgray/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/mralexgray/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/mralexgray/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/mralexgray/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/mralexgray/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false\n" +
            "    },\n" +
            "    \"html_url\": \"https://github.com/mralexgray/-REPONAME\",\n" +
            "    \"description\": null,\n" +
            "    \"fork\": false,\n" +
            "    \"url\": \"https://api.github.com/repos/mralexgray/-REPONAME\",\n" +
            "    \"forks_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/forks\",\n" +
            "    \"keys_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/keys{/key_id}\",\n" +
            "    \"collaborators_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/collaborators{/collaborator}\",\n" +
            "    \"teams_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/teams\",\n" +
            "    \"hooks_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/hooks\",\n" +
            "    \"issue_events_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/issues/events{/number}\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/events\",\n" +
            "    \"assignees_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/assignees{/user}\",\n" +
            "    \"branches_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/branches{/branch}\",\n" +
            "    \"tags_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/tags\",\n" +
            "    \"blobs_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/git/blobs{/sha}\",\n" +
            "    \"git_tags_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/git/tags{/sha}\",\n" +
            "    \"git_refs_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/git/refs{/sha}\",\n" +
            "    \"trees_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/git/trees{/sha}\",\n" +
            "    \"statuses_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/statuses/{sha}\",\n" +
            "    \"languages_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/languages\",\n" +
            "    \"stargazers_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/stargazers\",\n" +
            "    \"contributors_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/contributors\",\n" +
            "    \"subscribers_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/subscribers\",\n" +
            "    \"subscription_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/subscription\",\n" +
            "    \"commits_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/commits{/sha}\",\n" +
            "    \"git_commits_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/git/commits{/sha}\",\n" +
            "    \"comments_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/comments{/number}\",\n" +
            "    \"issue_comment_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/issues/comments{/number}\",\n" +
            "    \"contents_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/contents/{+path}\",\n" +
            "    \"compare_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/compare/{base}...{head}\",\n" +
            "    \"merges_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/merges\",\n" +
            "    \"archive_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/{archive_format}{/ref}\",\n" +
            "    \"downloads_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/downloads\",\n" +
            "    \"issues_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/issues{/number}\",\n" +
            "    \"pulls_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/pulls{/number}\",\n" +
            "    \"milestones_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/milestones{/number}\",\n" +
            "    \"notifications_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/notifications{?since,all,participating}\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/labels{/name}\",\n" +
            "    \"releases_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/releases{/id}\",\n" +
            "    \"deployments_url\": \"https://api.github.com/repos/mralexgray/-REPONAME/deployments\",\n" +
            "    \"created_at\": \"2012-10-06T16:37:39Z\",\n" +
            "    \"updated_at\": \"2013-01-12T13:39:30Z\",\n" +
            "    \"pushed_at\": \"2012-10-06T16:37:39Z\",\n" +
            "    \"git_url\": \"git://github.com/mralexgray/-REPONAME.git\",\n" +
            "    \"ssh_url\": \"git@github.com:mralexgray/-REPONAME.git\",\n" +
            "    \"clone_url\": \"https://github.com/mralexgray/-REPONAME.git\",\n" +
            "    \"svn_url\": \"https://github.com/mralexgray/-REPONAME\",\n" +
            "    \"homepage\": null,\n" +
            "    \"size\": 48,\n" +
            "    \"stargazers_count\": 0,\n" +
            "    \"watchers_count\": 0,\n" +
            "    \"language\": null,\n" +
            "    \"has_issues\": true,\n" +
            "    \"has_projects\": true,\n" +
            "    \"has_downloads\": true,\n" +
            "    \"has_wiki\": true,\n" +
            "    \"has_pages\": false,\n" +
            "    \"forks_count\": 0,\n" +
            "    \"mirror_url\": null,\n" +
            "    \"archived\": false,\n" +
            "    \"disabled\": false,\n" +
            "    \"open_issues_count\": 0,\n" +
            "    \"license\": null,\n" +
            "    \"forks\": 0,\n" +
            "    \"open_issues\": 0,\n" +
            "    \"watchers\": 0,\n" +
            "    \"default_branch\": \"master\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 104510411,\n" +
            "    \"node_id\": \"MDEwOlJlcG9zaXRvcnkxMDQ1MTA0MTE=\",\n" +
            "    \"name\": \"...\",\n" +
            "    \"full_name\": \"mralexgray/...\",\n" +
            "    \"private\": false,\n" +
            "    \"owner\": {\n" +
            "      \"login\": \"mralexgray\",\n" +
            "      \"id\": 262517,\n" +
            "      \"node_id\": \"MDQ6VXNlcjI2MjUxNw==\",\n" +
            "      \"avatar_url\": \"https://avatars3.githubusercontent.com/u/262517?v=4\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/mralexgray\",\n" +
            "      \"html_url\": \"https://github.com/mralexgray\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/mralexgray/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/mralexgray/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/mralexgray/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/mralexgray/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/mralexgray/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/mralexgray/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/mralexgray/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/mralexgray/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/mralexgray/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false\n" +
            "    },\n" +
            "    \"html_url\": \"https://github.com/mralexgray/...\",\n" +
            "    \"description\": \":computer:Publicrepoformypersonaldotfiles.\",\n" +
            "    \"fork\": true,\n" +
            "    \"url\": \"https://api.github.com/repos/mralexgray/...\",\n" +
            "    \"forks_url\": \"https://api.github.com/repos/mralexgray/.../forks\",\n" +
            "    \"keys_url\": \"https://api.github.com/repos/mralexgray/.../keys{/key_id}\",\n" +
            "    \"collaborators_url\": \"https://api.github.com/repos/mralexgray/.../collaborators{/collaborator}\",\n" +
            "    \"teams_url\": \"https://api.github.com/repos/mralexgray/.../teams\",\n" +
            "    \"hooks_url\": \"https://api.github.com/repos/mralexgray/.../hooks\",\n" +
            "    \"issue_events_url\": \"https://api.github.com/repos/mralexgray/.../issues/events{/number}\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/mralexgray/.../events\",\n" +
            "    \"assignees_url\": \"https://api.github.com/repos/mralexgray/.../assignees{/user}\",\n" +
            "    \"branches_url\": \"https://api.github.com/repos/mralexgray/.../branches{/branch}\",\n" +
            "    \"tags_url\": \"https://api.github.com/repos/mralexgray/.../tags\",\n" +
            "    \"blobs_url\": \"https://api.github.com/repos/mralexgray/.../git/blobs{/sha}\",\n" +
            "    \"git_tags_url\": \"https://api.github.com/repos/mralexgray/.../git/tags{/sha}\",\n" +
            "    \"git_refs_url\": \"https://api.github.com/repos/mralexgray/.../git/refs{/sha}\",\n" +
            "    \"trees_url\": \"https://api.github.com/repos/mralexgray/.../git/trees{/sha}\",\n" +
            "    \"statuses_url\": \"https://api.github.com/repos/mralexgray/.../statuses/{sha}\",\n" +
            "    \"languages_url\": \"https://api.github.com/repos/mralexgray/.../languages\",\n" +
            "    \"stargazers_url\": \"https://api.github.com/repos/mralexgray/.../stargazers\",\n" +
            "    \"contributors_url\": \"https://api.github.com/repos/mralexgray/.../contributors\",\n" +
            "    \"subscribers_url\": \"https://api.github.com/repos/mralexgray/.../subscribers\",\n" +
            "    \"subscription_url\": \"https://api.github.com/repos/mralexgray/.../subscription\",\n" +
            "    \"commits_url\": \"https://api.github.com/repos/mralexgray/.../commits{/sha}\",\n" +
            "    \"git_commits_url\": \"https://api.github.com/repos/mralexgray/.../git/commits{/sha}\",\n" +
            "    \"comments_url\": \"https://api.github.com/repos/mralexgray/.../comments{/number}\",\n" +
            "    \"issue_comment_url\": \"https://api.github.com/repos/mralexgray/.../issues/comments{/number}\",\n" +
            "    \"contents_url\": \"https://api.github.com/repos/mralexgray/.../contents/{+path}\",\n" +
            "    \"compare_url\": \"https://api.github.com/repos/mralexgray/.../compare/{base}...{head}\",\n" +
            "    \"merges_url\": \"https://api.github.com/repos/mralexgray/.../merges\",\n" +
            "    \"archive_url\": \"https://api.github.com/repos/mralexgray/.../{archive_format}{/ref}\",\n" +
            "    \"downloads_url\": \"https://api.github.com/repos/mralexgray/.../downloads\",\n" +
            "    \"issues_url\": \"https://api.github.com/repos/mralexgray/.../issues{/number}\",\n" +
            "    \"pulls_url\": \"https://api.github.com/repos/mralexgray/.../pulls{/number}\",\n" +
            "    \"milestones_url\": \"https://api.github.com/repos/mralexgray/.../milestones{/number}\",\n" +
            "    \"notifications_url\": \"https://api.github.com/repos/mralexgray/.../notifications{?since,all,participating}\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/mralexgray/.../labels{/name}\",\n" +
            "    \"releases_url\": \"https://api.github.com/repos/mralexgray/.../releases{/id}\",\n" +
            "    \"deployments_url\": \"https://api.github.com/repos/mralexgray/.../deployments\",\n" +
            "    \"created_at\": \"2017-09-22T19:19:42Z\",\n" +
            "    \"updated_at\": \"2017-09-22T19:20:22Z\",\n" +
            "    \"pushed_at\": \"2017-09-15T08:27:32Z\",\n" +
            "    \"git_url\": \"git://github.com/mralexgray/....git\",\n" +
            "    \"ssh_url\": \"git@github.com:mralexgray/....git\",\n" +
            "    \"clone_url\": \"https://github.com/mralexgray/....git\",\n" +
            "    \"svn_url\": \"https://github.com/mralexgray/...\",\n" +
            "    \"homepage\": \"https://driesvints.com/blog/getting-started-with-dotfiles\",\n" +
            "    \"size\": 113,\n" +
            "    \"stargazers_count\": 0,\n" +
            "    \"watchers_count\": 0,\n" +
            "    \"language\": \"Shell\",\n" +
            "    \"has_issues\": false,\n" +
            "    \"has_projects\": true,\n" +
            "    \"has_downloads\": true,\n" +
            "    \"has_wiki\": false,\n" +
            "    \"has_pages\": false,\n" +
            "    \"forks_count\": 0,\n" +
            "    \"mirror_url\": null,\n" +
            "    \"archived\": false,\n" +
            "    \"disabled\": false,\n" +
            "    \"open_issues_count\": 0,\n" +
            "    \"license\": {\n" +
            "      \"key\": \"mit\",\n" +
            "      \"name\": \"MITLicense\",\n" +
            "      \"spdx_id\": \"MIT\",\n" +
            "      \"url\": \"https://api.github.com/licenses/mit\",\n" +
            "      \"node_id\": \"MDc6TGljZW5zZTEz\"\n" +
            "    },\n" +
            "    \"forks\": 0,\n" +
            "    \"open_issues\": 0,\n" +
            "    \"watchers\": 0,\n" +
            "    \"default_branch\": \"master\"\n" +
            "  },  {\n" +
            "    \"id\": 20027360,\n" +
            "    \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMDAyNzM2MA==\",\n" +
            "    \"name\": \"app\",\n" +
            "    \"full_name\": \"mralexgray/app\",\n" +
            "    \"private\": false,\n" +
            "    \"owner\": {\n" +
            "      \"login\": \"mralexgray\",\n" +
            "      \"id\": 262517,\n" +
            "      \"node_id\": \"MDQ6VXNlcjI2MjUxNw==\",\n" +
            "      \"avatar_url\": \"https://avatars3.githubusercontent.com/u/262517?v=4\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/mralexgray\",\n" +
            "      \"html_url\": \"https://github.com/mralexgray\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/mralexgray/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/mralexgray/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/mralexgray/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/mralexgray/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/mralexgray/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/mralexgray/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/mralexgray/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/mralexgray/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/mralexgray/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false\n" +
            "    },\n" +
            "    \"html_url\": \"https://github.com/mralexgray/app\",\n" +
            "    \"description\": \"Instantmobilewebappcreation\",\n" +
            "    \"fork\": true,\n" +
            "    \"url\": \"https://api.github.com/repos/mralexgray/app\",\n" +
            "    \"forks_url\": \"https://api.github.com/repos/mralexgray/app/forks\",\n" +
            "    \"keys_url\": \"https://api.github.com/repos/mralexgray/app/keys{/key_id}\",\n" +
            "    \"collaborators_url\": \"https://api.github.com/repos/mralexgray/app/collaborators{/collaborator}\",\n" +
            "    \"teams_url\": \"https://api.github.com/repos/mralexgray/app/teams\",\n" +
            "    \"hooks_url\": \"https://api.github.com/repos/mralexgray/app/hooks\",\n" +
            "    \"issue_events_url\": \"https://api.github.com/repos/mralexgray/app/issues/events{/number}\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/mralexgray/app/events\",\n" +
            "    \"assignees_url\": \"https://api.github.com/repos/mralexgray/app/assignees{/user}\",\n" +
            "    \"branches_url\": \"https://api.github.com/repos/mralexgray/app/branches{/branch}\",\n" +
            "    \"tags_url\": \"https://api.github.com/repos/mralexgray/app/tags\",\n" +
            "    \"blobs_url\": \"https://api.github.com/repos/mralexgray/app/git/blobs{/sha}\",\n" +
            "    \"git_tags_url\": \"https://api.github.com/repos/mralexgray/app/git/tags{/sha}\",\n" +
            "    \"git_refs_url\": \"https://api.github.com/repos/mralexgray/app/git/refs{/sha}\",\n" +
            "    \"trees_url\": \"https://api.github.com/repos/mralexgray/app/git/trees{/sha}\",\n" +
            "    \"statuses_url\": \"https://api.github.com/repos/mralexgray/app/statuses/{sha}\",\n" +
            "    \"languages_url\": \"https://api.github.com/repos/mralexgray/app/languages\",\n" +
            "    \"stargazers_url\": \"https://api.github.com/repos/mralexgray/app/stargazers\",\n" +
            "    \"contributors_url\": \"https://api.github.com/repos/mralexgray/app/contributors\",\n" +
            "    \"subscribers_url\": \"https://api.github.com/repos/mralexgray/app/subscribers\",\n" +
            "    \"subscription_url\": \"https://api.github.com/repos/mralexgray/app/subscription\",\n" +
            "    \"commits_url\": \"https://api.github.com/repos/mralexgray/app/commits{/sha}\",\n" +
            "    \"git_commits_url\": \"https://api.github.com/repos/mralexgray/app/git/commits{/sha}\",\n" +
            "    \"comments_url\": \"https://api.github.com/repos/mralexgray/app/comments{/number}\",\n" +
            "    \"issue_comment_url\": \"https://api.github.com/repos/mralexgray/app/issues/comments{/number}\",\n" +
            "    \"contents_url\": \"https://api.github.com/repos/mralexgray/app/contents/{+path}\",\n" +
            "    \"compare_url\": \"https://api.github.com/repos/mralexgray/app/compare/{base}...{head}\",\n" +
            "    \"merges_url\": \"https://api.github.com/repos/mralexgray/app/merges\",\n" +
            "    \"archive_url\": \"https://api.github.com/repos/mralexgray/app/{archive_format}{/ref}\",\n" +
            "    \"downloads_url\": \"https://api.github.com/repos/mralexgray/app/downloads\",\n" +
            "    \"issues_url\": \"https://api.github.com/repos/mralexgray/app/issues{/number}\",\n" +
            "    \"pulls_url\": \"https://api.github.com/repos/mralexgray/app/pulls{/number}\",\n" +
            "    \"milestones_url\": \"https://api.github.com/repos/mralexgray/app/milestones{/number}\",\n" +
            "    \"notifications_url\": \"https://api.github.com/repos/mralexgray/app/notifications{?since,all,participating}\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/mralexgray/app/labels{/name}\",\n" +
            "    \"releases_url\": \"https://api.github.com/repos/mralexgray/app/releases{/id}\",\n" +
            "    \"deployments_url\": \"https://api.github.com/repos/mralexgray/app/deployments\",\n" +
            "    \"created_at\": \"2014-05-21T15:54:20Z\",\n" +
            "    \"updated_at\": \"2014-05-21T15:54:22Z\",\n" +
            "    \"pushed_at\": \"2014-05-20T19:51:38Z\",\n" +
            "    \"git_url\": \"git://github.com/mralexgray/app.git\",\n" +
            "    \"ssh_url\": \"git@github.com:mralexgray/app.git\",\n" +
            "    \"clone_url\": \"https://github.com/mralexgray/app.git\",\n" +
            "    \"svn_url\": \"https://github.com/mralexgray/app\",\n" +
            "    \"homepage\": null,\n" +
            "    \"size\": 1890,\n" +
            "    \"stargazers_count\": 0,\n" +
            "    \"watchers_count\": 0,\n" +
            "    \"language\": \"JavaScript\",\n" +
            "    \"has_issues\": false,\n" +
            "    \"has_projects\": true,\n" +
            "    \"has_downloads\": true,\n" +
            "    \"has_wiki\": true,\n" +
            "    \"has_pages\": false,\n" +
            "    \"forks_count\": 0,\n" +
            "    \"mirror_url\": null,\n" +
            "    \"archived\": false,\n" +
            "    \"disabled\": false,\n" +
            "    \"open_issues_count\": 0,\n" +
            "    \"license\": {\n" +
            "      \"key\": \"other\",\n" +
            "      \"name\": \"Other\",\n" +
            "      \"spdx_id\": \"NOASSERTION\",\n" +
            "      \"url\": null,\n" +
            "      \"node_id\": \"MDc6TGljZW5zZTA=\"\n" +
            "    },\n" +
            "    \"forks\": 0,\n" +
            "    \"open_issues\": 0,\n" +
            "    \"watchers\": 0,\n" +
            "    \"default_branch\": \"master\"\n" +
            "  }\n" +
            "]";
}