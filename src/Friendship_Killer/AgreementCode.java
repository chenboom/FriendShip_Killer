package Friendship_Killer;

public class AgreementCode {
	public static final String login = "0001";					//��½
	public static final String matching = "0002";				//ƥ��
	public static final String end = "0003";					//������ǰ����Ϸ
	public static final String register = "0004";				//ע��
	public static final String quitFromRoom = "0005";			//����˳�����
	public static final String quitFromGame = "0006";			//����˳���Ϸ
	public static final String winnerone = "0007";				//���ʤ��
	public static final String gamedata = "0000";				//��Ϸ����
	public static final String newPlayer = "1000";				//����Ҽ��뷿��
	public static final String loginStatForFail = "2000";		//��½ʧ��
	public static final String loginStatForSuccess = "3000";	//��½�ɹ�
	public static final String newMap = "4000";					//��ͼ����
	public static final String weapon = "5000";					//��������
	public static final String matchingStatForFail = "6000";	//ƥ��ʧ��
	public static final String matchingStatForSuccess = "7000";	//ƥ��ɹ�
	public static final String registerStatForFail = "8000";	//ע��ʧ��
	public static final String registerStatForSuccess = "9000";	//ע��ɹ�
	public static final String otherQuitFromRoom = "0100";		//��������˳�����
	public static final String winnerOne = "0200";				//ʤ����
	
	/*
	 * ��Э��Լ����ʽ:
	 * Attention1:����useridΪ���id��roomidΪ����id������ƥ��ʱ���������أ�
	 * Attention2������0000Ϊs
	 *
	 * login									String="0001"+"username"+"^"+"password";
	 * matching									String="0002"+"username";
	 * end										String="0003"+"roomid";
	 * register									String="0004"+"username"+"^"+"mail"+"^"+"passworld";
	 * quitFromRoom								String="0005"+"userid"+"^"+"roomid";
	 * quitFromGame								String="0006"+userid+^+roomid;
	 * winnerone								String="0007"+userid+^+roomid;
	 * gamedate									String="0000"+"userid"+"^"+"roomid"+"^"+"data";
	 * newplayer								String="1000"+"userid"+"^"+"roomid"+"^"+statinroom";
	 * loginStatForFail							String="2000";
	 * loginStatForSuccess						String="3000";
	 * newMap									String="4000"��"mapid";
	 * weapon									String="5000"+"weaponid;
	 * matchingStatforFail						String="6000";
	 * natchingStatForSuccess					String="7000"+"userid"+"^"+"roomid"+"^"+"statinroom"+"^"+"user_1id"+"^"
	 * 													+"user_2id"+"^"+"user_3id"+"^"+"user_4id";������ĳuser����������-1��ʶ��������0��ʶ��
	 * registerStatForFail						String="8000";
	 * registerStatForSuccess					String="9000";
	 * otherQuitFromRoom						String="0100"+userid";
	 * winnerOne								String="0200"+"userid";
	 */
}
